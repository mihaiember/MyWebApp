package ro.ember.appointments.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table (name="doctors")
public class Doctor   {

    @Id
    @Column(name="id")
    private int doctorId;

    @Column (name = "name")
    private String doctorName;

    @OneToMany(mappedBy = "doctor")
    List<Appointment> appointments;

    public Doctor (){

    }


    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
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
