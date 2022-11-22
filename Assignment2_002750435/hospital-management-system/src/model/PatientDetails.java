/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import model.PersonDetails;
/**
 *
 * @author zainabkhokawala
 */
public class PatientDetails extends PersonDetails {
         
    private ArrayList<EncounterDetails> encounterHistory;
    
    public PatientDetails(){
    }

    public PatientDetails(long personSSN, String personFullName, String personGender, int personAge, long personPhoneNumber,
            String userName, String userPassword, House house)
     {
        
        this.setPersonSSN(personSSN);
        this.setPersonFullName(personFullName);
        this.setUserRole(UserRole.PATIENT);
        this.setPersonGender(personGender);
        this.setPersonAge(personAge);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setHouse(house);
        this.encounterHistory = new ArrayList();
    }

    public ArrayList<EncounterDetails> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<EncounterDetails> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    


    
    
    
}
