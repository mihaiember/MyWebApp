package ro.ember.appointments.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.ember.appointments.entity.Appointment;
import ro.ember.appointments.entity.Doctor;
import ro.ember.appointments.model.AppointmentModel;
import ro.ember.appointments.model.CabinetModel;
import ro.ember.appointments.model.DoctorModel;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.print.Doc;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static ro.ember.persistence.JpaListener.PERSISTENCE_FACTORY;

@WebServlet (urlPatterns = "/doctorAndDateSearchForm")
public class DoctorAndDateSearchServlet extends HttpServlet {
    private EntityManager entityManager;
    private CabinetModel cabinetModel;
    private DoctorModel doctorModel;
    private AppointmentModel appointmentModel;
    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServlet.class.getName());

    @Override
    public void init() throws ServletException {
        LOGGER.info("Initializing doctorSearch servlet");
        super.init();
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute(PERSISTENCE_FACTORY);
        entityManager = emf.createEntityManager();
        doctorModel = new DoctorModel(entityManager);
        appointmentModel = new AppointmentModel(entityManager);
        cabinetModel = new CabinetModel(entityManager);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("doctors", doctorModel.getDoctors());
        req.getRequestDispatcher("/jsps/doctorAndDateSearchForm.jsp").forward(req, resp);
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String doctor = req.getParameter("doctor");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        List<Appointment> appointmentFromDb = appointmentModel.getAppointmentsForDoctors(doctor, startDate, endDate);
        req.setAttribute("results", appointmentFromDb);
        req.getRequestDispatcher("/jsps/results.jsp").forward(req, resp);
    }
}
