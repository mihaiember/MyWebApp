package ro.ember.appointments.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import static ro.ember.persistence.JpaListener.PERSISTENCE_FACTORY;

@WebServlet(urlPatterns = "/edit")
public class EditServlet extends HttpServlet {
    private EntityManager entityManager;
    private CabinetModel cabinetModel;
    private DoctorModel doctorModel;
    private AppointmentModel appointmentModel;
    private static final Logger LOGGER = LoggerFactory.getLogger(AppointmentServlet.class.getName());

    @Override
    public void init() throws ServletException {
        LOGGER.info("Initializing edit servlet");
        super.init();
        EntityManagerFactory emf = (EntityManagerFactory) getServletContext().getAttribute(PERSISTENCE_FACTORY);
        entityManager = emf.createEntityManager();
        doctorModel = new DoctorModel(entityManager);
        appointmentModel = new AppointmentModel(entityManager);
        cabinetModel = new CabinetModel(entityManager);

    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/jsps/edit.jsp").forward(req, resp);

        System.out.println("dispatch");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.getRequestDispatcher("/jsps/edit.jsp").forward(req, resp);
    }
}
