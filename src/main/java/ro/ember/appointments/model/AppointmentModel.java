package ro.ember.appointments.model;

import com.sun.xml.ws.api.model.CheckedException;
import ro.ember.appointments.entity.Appointment;
import ro.ember.appointments.entity.Doctor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by Mike on 5/5/2018.
 */
public class AppointmentModel {
    private EntityManager entityManager;

    public AppointmentModel(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void scheduleAppointment(Appointment appointment){
        entityManager.getTransaction().begin();
        entityManager.persist(appointment);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }

    public List<Appointment> getAppointmentByPhone(String phoneNumber) {
        Query q = entityManager.createQuery("FROM ro.ember.appointments.entity.Appointment appointment  WHERE appointment.patientPhoneNumber = :phone");
        q.setParameter("phone", phoneNumber);
        List <Appointment> appointmentsByPhone = q.getResultList();
        return appointmentsByPhone;
    }

    public List<Appointment> getAppointmentsForDoctors(String doctor, String startDate, String endDate) {
        Query query = entityManager.createQuery("FROM ro.ember.appointments.entity.Appointment appointment  WHERE appointment.doctor.doctorId = :doctor and appointment.date >= :startDate and appointment.date <= :endDate");
        query.setParameter("doctor", new Integer (doctor));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date start = new Date();
        try {
            start= dateFormat.parse(startDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date end = new Date();

        try {
            end = dateFormat.parse(endDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(end);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.HOUR, 23);
        end = calendar.getTime();
        query.setParameter("startDate", start);
        query.setParameter("endDate", end);
        List<Appointment> appointmentsForDoctors = query.getResultList();
        return appointmentsForDoctors;
    }





}
