/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zainabkhokawala
 */
public class PersonDetails {
    
    public enum UserRole{
        SYSTEM_ADMIN,
        COMMUNITY_ADMIN,
        HOSPITAL_ADMIN,
        PATIENT,
        DOCTOR
    }
    private String personFullName;
    private String personGender;
    private int personAge;
    private long personPhoneNumber;
    private long personSSN;
    private String userName;
    private String userPassword;
    private House house;
    private UserRole userRole;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPersonFullName() {
        return personFullName;
    }

    public void setPersonFullName(String personFirstName) {
        this.personFullName = personFirstName;
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public long getPersonPhoneNumber() {
        return personPhoneNumber;
    }

    public void setPersonPhoneNumber(long personPhoneNumber) {
        this.personPhoneNumber = personPhoneNumber;
    }

    public long getPersonSSN() {
        return personSSN;
    }

    public void setPersonSSN(long personSSN) {
        this.personSSN = personSSN;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    
}
