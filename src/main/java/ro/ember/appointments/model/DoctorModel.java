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

    public List<Doctor> getDoctors(){
        Query q = entityManager.createQuery("SELECT doctors FROM ro.ember.appointments.entity.Doctor doctors");
        List<Doctor> doctors = q.getResultList();
        return doctors;
    }

    public Doctor getDoctorById(int doctorId){
        return entityManager.find(Doctor.class, doctorId);
    }
}
