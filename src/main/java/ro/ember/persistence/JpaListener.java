package ro.ember.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManagerFactory;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class JpaListener implements ServletContextListener{
    public static final String PERSISTENCE_FACTORY = "PERSISTENCE_FACTORY";

    private static final Logger LOGGER = LoggerFactory.getLogger("postgres");

    public void contextInitialized(ServletContextEvent sce) {

        EntityManagerFactory factory = PersistenceFactory.getInstance();
        sce.getServletContext().setAttribute(PERSISTENCE_FACTORY, factory);

        LOGGER.info("Init of persistence factory successful");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        EntityManagerFactory factory = (EntityManagerFactory) sce.getServletContext().getAttribute(PERSISTENCE_FACTORY);
        factory.close();

        LOGGER.info("Closing of the persistence factory successful");
    }
}
