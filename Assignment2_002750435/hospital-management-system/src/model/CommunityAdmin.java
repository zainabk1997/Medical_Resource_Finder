/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.PersonDetails;

/**
 *
 * @author zainabkhokawala
 */
public class CommunityAdmin extends PersonDetails {
    
    private long AdminID;
    private long ManagementID;

    
    public CommunityAdmin(long personSSN, String personFullName, String personGender, int personAge, long personPhoneNumber,
            String userName, String userPassword, long AdminID, long ManagementID){
        
        this.setPersonSSN(personSSN);
        this.setPersonFullName(personFullName);
        this.setUserRole(UserRole.COMMUNITY_ADMIN);
        this.setPersonGender(personGender);
        this.setPersonAge(personAge);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.AdminID = AdminID;
        this.ManagementID = ManagementID;
            
    }

    public long getAdminID() {
        return AdminID;
    }

    public void setAdminID(long AdminID) {
        this.AdminID = AdminID;
    }

    public long getManagementID() {
        return ManagementID;
    }

    public void setManagementID(long ManagementID) {
        this.ManagementID = ManagementID;
    }

      
    
}
