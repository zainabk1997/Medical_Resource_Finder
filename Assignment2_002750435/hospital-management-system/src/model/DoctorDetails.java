/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;
import java.util.ArrayList;
import model.Hospital;
import model.PersonDetails;
import model.VitalSigns;
/**
 *
 * @author zainabkhokawala
 */
public class DoctorDetails extends PersonDetails {

    /**
     * @param args the command line arguments
     */
    private long doctorID;
    private String hospitalName;
    private String doctorSpecialization;
    private ArrayList<EncounterDetails> encounterHistory;
    
    public DoctorDetails(long personSSN, String personFullName, String personGender, int personAge, long personPhoneNumber,
            String userName, String userPassword, House house, long doctorID, String doctorSpecialization, String hospitalName
    ){
        
        this.setPersonSSN(personSSN);
        this.setPersonFullName(personFullName);
        this.setUserRole(UserRole.DOCTOR);
        this.setPersonGender(personGender);
        this.setPersonAge(personAge);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setHouse(house);
        this.doctorID = doctorID;
        this.doctorSpecialization = doctorSpecialization;
        this.hospitalName = hospitalName;
        
    }

    public long getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(long doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(String doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }

  

    public ArrayList<EncounterDetails> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterDetails> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
 
}
