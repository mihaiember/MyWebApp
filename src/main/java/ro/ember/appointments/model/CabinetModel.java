package ro.ember.appointments.model;



import ro.ember.appointments.entity.Cabinet;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.UUID;



public class CabinetModel {
    private EntityManager entityManager;
    public CabinetModel (EntityManager entityManager){
        this.entityManager=entityManager;
    }

    public List<Cabinet> getCabinets(){
        Query q = entityManager.createQuery("select cabinet from ro.ember.appointments.entity.Cabinet cabinet");
        List<Cabinet> cabinets = q.getResultList();
        return cabinets;
    }

    public Cabinet getCabinetById(UUID id){
        return entityManager.find(Cabinet.class, id);
    }
}
