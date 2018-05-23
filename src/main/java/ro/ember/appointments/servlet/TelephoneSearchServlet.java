package ro.ember.appointments.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.ember.appointments.entity.Appointment;
import ro.ember.appointments.model.AppointmentModel;
import ro.ember.appointments.model.CabinetModel;
import ro.ember.appointments.model.DoctorModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static ro.ember.persistence.JpaListener.PERSISTENCE_FACTORY;

@WebServlet (urlPatterns = "/telephoneSearch")
public class TelephoneSearchServlet extends HttpServlet {
    private EntityManager entityManager;
    private CabinetModel cabinetModel;
    private DoctorModel doctorModel;
    private AppointmentModel appointmentModel;
    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServlet.class.getName());

    @Override
    public void init() throws ServletException {

        LOGGER.info("Initializing SearchByPhone servlet");
        super.init();
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute(PERSISTENCE_FACTORY);
        //EntityManagerFactory entityManagerFactory = (EntityManagerFactory) getServletContext().setAttribute();
        entityManager = emf.createEntityManager();
        cabinetModel = new CabinetModel(entityManager);
        doctorModel = new DoctorModel(entityManager);
        appointmentModel = new AppointmentModel(entityManager);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsps/telephoneSearchForm.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String phoneNumber = req.getParameter("phone");
        List<Appointment> appointmentFromDb = appointmentModel.getAppointmentByPhone(phoneNumber);
        req.setAttribute("results", appointmentFromDb);
        System.out.println(appointmentFromDb.size());
        req.getRequestDispatcher("/jsps/results.jsp").forward(req, resp);
    }
}
