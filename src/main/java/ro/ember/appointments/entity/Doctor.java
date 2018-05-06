package ro.ember.appointments.entity;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name="doctors")
public class Doctor   {

    @Id
    @Column(name="id")
    private UUID doctorId;

    @Column (name = "name")
    private String doctorName;

    @OneToMany(mappedBy = "doctors")
    List<Appointment> appointments;

    public Doctor (){

    }


    public UUID getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(UUID doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}