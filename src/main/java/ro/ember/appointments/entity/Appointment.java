package ro.ember.appointments.entity;



import javax.persistence.*;
import java.util.Date;



@Entity
@Table(name="appointments")
public class Appointment {
    @Id @GeneratedValue
    @Column(name = "id")
    private int appointmentId;

    @ManyToOne
    private Doctor doctor;

    @ManyToOne
    private Cabinet cabinet;

    @Column(name = "date")
    private Date date;

    @Column(name = "patient_last_name")
    private String patientLastName;

    @Column(name = "patient_firts_name")
    private String patientFirstName;

    @Column(name = "patient_phone_number")
    private String patientPhoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(name="sending_letter")
    private SendingLetter sendingLetter;


    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
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

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String pacientLastName) {
        this.patientLastName = pacientLastName;
    }

    public String getPatientFirstName() {
        return patientFirstName;
    }

    public void setPatientFirstName(String pacientFirstName) {
        this.patientFirstName = pacientFirstName;
    }

    public String getPatientPhoneNumber() {
        return patientPhoneNumber;
    }

    public void setPatientPhoneNumber(String patientPhoneNumber) {
        this.patientPhoneNumber = patientPhoneNumber;
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
