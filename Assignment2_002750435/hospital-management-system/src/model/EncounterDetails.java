/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Date;
import model.VitalSigns;

/**
 *
 * @author zainabkhokawala
 */
public class EncounterDetails {
    
    private long encounterID;
    private VitalSigns vitalSigns;
    private Date encounterDate;
    private String prescribedMedicine;
    private String encounterTime;
    private String patientName;
    private String doctorName;

    public EncounterDetails(long encounterID, Date encounterDate, String encounterTime,
            String prescribedMedicine, String patientName, String doctorName, VitalSigns vitalsigns){
        this.encounterID = encounterID;
        this.vitalSigns = vitalsigns;
        this.encounterDate = encounterDate;
        System.out.println(this.encounterDate);
        this.prescribedMedicine = prescribedMedicine;
        this.encounterTime = encounterTime;
        System.out.println(this.encounterTime);
        this.patientName = patientName;
        this.doctorName = doctorName;

    }

    public long getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(long encounterID) {
        this.encounterID = encounterID;
    }

    public String getEncounterTime() {
        return encounterTime;
    }

    public void setEncounterTime(String encounterTime) {
        this.encounterTime = encounterTime;
    }



    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public Date getEncounterDate() {
        return encounterDate;
    }

    public void setEncounterDate(Date encounterDate) {
        this.encounterDate = encounterDate;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public void setPrescribedMedicine(String prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
}
