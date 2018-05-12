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
import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

import static java.util.UUID.fromString;
import static ro.ember.persistence.JpaListener.PERSISTENCE_FACTORY;

/**
 * Created by Mike on 5/5/2018.
 */
@WebServlet (urlPatterns = "/Appointment")
public class AppointmentServlet extends HttpServlet {
    private EntityManager entityManager;
    private CabinetModel cabinetModel;
    private DoctorModel doctorModel;
    private AppointmentModel appointmentModel;
    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServlet.class.getName());

    @Override
    public void init() throws ServletException {

        LOGGER.info("Initializing planning servlet");
        super.init();
        EntityManagerFactory emf = (EntityManagerFactory)getServletContext().getAttribute(PERSISTENCE_FACTORY);
        entityManager = emf.createEntityManager();
        cabinetModel = new CabinetModel(entityManager);
        doctorModel = new DoctorModel(entityManager);
        appointmentModel = new AppointmentModel(entityManager);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { req.setAttribute("doctors", doctorModel.getDoctors());
        req.setAttribute("cabinets", cabinetModel.getCabinets());
        req.setAttribute("doctors", doctorModel.getDoctors());

        req.getRequestDispatcher("/jsps/Appointment.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int doctorId = Integer.parseInt(req.getParameter("doctor"));
        int cabinetId = Integer.parseInt(req.getParameter("cabinet"));
        Doctor doctor = doctorModel.getDoctorById(doctorId);
        Cabinet cabinet = cabinetModel.getCabinetById(cabinetId);
        //Date date = Date.from(req.getParameter("date"));

        Appointment appointment = new Appointment();
        //appointment.setAppointmentId(int appointmentID);
        appointment.setDoctor(doctor);
        appointment.setCabinet(cabinet);
        //appointment.setDate(date);
        appointmentModel.scheduleAppointment(appointment);
        resp.sendRedirect(getServletContext().getContextPath() + "/Appointment");
    }
}
