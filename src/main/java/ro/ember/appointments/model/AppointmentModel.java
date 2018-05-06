package ro.ember.appointments.model;

import ro.ember.appointments.entity.Appointment;

import javax.persistence.EntityManager;

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
}
