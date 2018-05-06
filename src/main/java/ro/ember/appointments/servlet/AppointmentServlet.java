package ro.ember.appointments.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.ember.appointments.entity.Appointment;
import ro.ember.appointments.entity.Cabinet;
import ro.ember.appointments.entity.Doctor;
import ro.ember.appointments.model.AppointmentModel;
import ro.ember.appointments.model.CabinetModel;
import ro.ember.appointments.model.DoctorModel;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

/**
 * Created by Mike on 5/5/2018.
 */
public class AppointmentServlet extends HttpServlet {
    private EntityManager entityManager;
    private CabinetModel cabinetModel;
    private DoctorModel doctorModel;
    private AppointmentModel appointmentModel;
    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServlet.class.getName());


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { req.setAttribute("doctors", doctorModel.getDoctor());
        req.setAttribute("cabinet", cabinetModel.getCabinets());
        req.getRequestDispatcher("/jsps/Appointment.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UUID doctorId = UUID.fromString(req.getParameter("doctor"));
        UUID cabinetId = UUID.fromString(req.getParameter("cabinet"));
        Doctor doctor = doctorModel.getDoctorById(doctorId);
        Cabinet cabinet = cabinetModel.getCabinetById(cabinetId);
        Appointment appointment = new Appointment();
        appointment.setAppontmentId(UUID.randomUUID());
        appointment.setDoctor(doctor);
        appointment.setCabinet(cabinet);
        appointmentModel.scheduleAppointment(appointment);
        resp.sendRedirect(getServletContext().getContextPath() + "/Appointment");
    }
}
