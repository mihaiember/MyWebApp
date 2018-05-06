package ro.ember.appointments.entity;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name="appointments")
public class Appointment {
    @Id
    @Column(name = "id")
    private UUID appointmentId;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Cabinet cabinet;

    @Column(name = "Date")
    private Date date;

    @Column(name = "Time")
    private Time time;

    @Column(name = "pacientLastName")
    private String pacientLastName;

    @Column(name = "pacientFirstName")
    private String pacientFirstName;

    @Column(name = "pacientPhoneNumber")
    private String pacientPhoneNumber;

    @Column(name="sendingLetter")
    private SendingLetter sendingLetter;


    public UUID getAppointmentId() {
        return appointmentId}

    public void setAppontmentId(UUID appontmentId) {
        this.appointmentId = appontmentId;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public void setCabinet(Cabinet cabinet) {
        this.cabinet = cabinet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getPacientLastName() {
        return pacientLastName;
    }

    public void setPacientLastName(String pacientLastName) {
        this.pacientLastName = pacientLastName;
    }

    public String getPacientFirstName() {
        return pacientFirstName;
    }

    public void setPacientFirstName(String pacientFirstName) {
        this.pacientFirstName = pacientFirstName;
    }

    public String getPacientPhoneNumber() {
        return pacientPhoneNumber;
    }

    public void setPacientPhoneNumber(String pacientPhoneNumber) {
        this.pacientPhoneNumber = pacientPhoneNumber;
    }

    public SendingLetter getSendingLetter() {
        return sendingLetter;
    }

    public void setSendingLetter(SendingLetter sendingLetter) {
        this.sendingLetter = sendingLetter;
    }

    public Appointment(){

    }
}
