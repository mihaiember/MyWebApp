package ro.ember.appointments.model;

import ro.ember.appointments.entity.Appointment;

import javax.persistence.EntityManager;

public class SearchModel {
    private EntityManager entityManager;

    public SearchModel(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void searchAppointment(Appointment appointment){
        entityManager.getTransaction().begin();
        entityManager.persist(appointment);
        entityManager.flush();
        entityManager.getTransaction().commit();
    }
}
