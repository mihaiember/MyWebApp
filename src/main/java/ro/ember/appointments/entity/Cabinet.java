package ro.ember.appointments.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "cabinets")
public class Cabinet {
    @Id
    @Column(name="id")
    private UUID cabinetId;

    @Column (name = "name")
    private String cabinetName;

    @OneToMany(mappedBy = "cabinets")
    List<Appointment> appointments;

    public Cabinet(){

    }

    public UUID getCabinetId() {
        return cabinetId;
    }

    public void setCabinetId(UUID cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getCabinetName() {
        return cabinetName;
    }

    public void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
