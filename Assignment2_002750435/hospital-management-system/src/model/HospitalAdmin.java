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
public class HospitalAdmin extends PersonDetails {
    
    private long haID;
    

    public HospitalAdmin(long personSSN, String personFullName, String personGender, int personAge, long personPhoneNumber,
            String userName, String userPassword, House house, long haID) {
        
        this.setPersonSSN(personSSN);
        this.setPersonFullName(personFullName);
        this.setUserRole(UserRole.HOSPITAL_ADMIN);
        this.setPersonGender(personGender);
        this.setPersonAge(personAge);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setHouse(house);
 
        
    }

    public long getHaID() {
        return haID;
    }

    public void setHaID(long haID) {
        this.haID = haID;
    }



    
}
