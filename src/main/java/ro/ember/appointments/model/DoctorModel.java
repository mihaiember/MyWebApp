package ro.ember.appointments.model;

import ro.ember.appointments.entity.Doctor;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;


public class DoctorModel {
    private EntityManager entityManager;
    public DoctorModel(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    public List<Doctor> getDoctor(){
        Query q = entityManager.createQuery("SELECT doctor FROM ro.ember.appointments.entity.Doctor doctor");
        List<Doctor> doctors = q.getResultList();
        return doctors;
    }

    public Doctor getDoctorById(UUID id){
        return entityManager.find(Doctor.class, id);
    }
}