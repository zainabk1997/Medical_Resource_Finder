/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.PersonDetails;
import java.util.ArrayList;
import java.util.Arrays;
import validators.NumberValidator;

/**
 *
 * @author zainabkhokawala
 */
public class SystemAdmin extends PersonDetails {
    
    public static PatientDirectory patientDirectoryRef = new PatientDirectory();
    public static DoctorDirectory doctorDirectoryRef = new DoctorDirectory();
    public static PersonDirectory personDirectoryRef = new PersonDirectory();
    public static CityDirectory cityDirectoryRef = new CityDirectory();
    public static CommunityDirectory communityDirectoryRef = new CommunityDirectory();    
    public static EncounterHistory  encounterHistoryRef = new EncounterHistory();
    public static HospitalDirectory  hospitalDirectoryRef = new HospitalDirectory();
    public static NumberValidator numValidator = new NumberValidator();


 

    public SystemAdmin(long personSSN, String personFullName, String personGender, int personAge, long personPhoneNumber,
            String userName, String userPassword, House house) {
        this.setPersonSSN(personSSN);
        this.setPersonFullName(personFullName);
        this.setUserRole(UserRole.SYSTEM_ADMIN);
        this.setPersonGender(personGender);
        this.setPersonAge(personAge);
        this.setPersonPhoneNumber(personPhoneNumber);
        this.setUserName(userName);
        this.setUserPassword(userPassword);
        this.setHouse(house);
    }
  
     static{
       personDirectoryRef.getPersonDirectory().add(new SystemAdmin(12345, "Zainab", "Female", 
               25, 8578679671L, "sysadd",
               "sysadd", new House("Westland Ave", 40, 02115)));
       
       personDirectoryRef.getPersonDirectory().add(new CommunityAdmin(46573, "Mark", "Male", 30, 6322345346L, "comadd",
               "comadd", 45671L, 87612L ));
       
       
       personDirectoryRef.getPersonDirectory().add(new HospitalAdmin(46573, "Jessica", "Non Binary", 35, 6322565346L, "hosadd",
               "hosadd", new House("Massachusetts Ave", 45, 02110), 87618L ));
    }
     
       static{
           
           PatientDetails p1 = new PatientDetails(12367, "Manav", "Male", 
               22, 7234392289L, "manav",
               "manav", new House("Park Drive", 21, 02117));
       personDirectoryRef.getPersonDirectory().add(p1);
       patientDirectoryRef.getPatientDirectory().add(p1);
     }
       
       static{
           
           DoctorDetails d1 = new DoctorDetails(12368, "Hirey", "Non Binary", 
               23, 7234392280L, "hirey","hell1", new House("Park Drive", 21, 2115L), 
       12344L, "Cardiologist", "Boston Hospital");
           
           DoctorDetails d2 = new DoctorDetails(12369, "Prabhu", "Male", 
               23, 7234392287L, "prabhu","hell2", new House("Park Drive", 12, 2115L), 
       12344L, "Cardiologist", "Boston Hospital");
           
       personDirectoryRef.getPersonDirectory().add(d1);
       doctorDirectoryRef.getDoctorDirectory().add(d1);
       
        personDirectoryRef.getPersonDirectory().add(d2);
               doctorDirectoryRef.getDoctorDirectory().add(d2);
       
       
       cityDirectoryRef.getCityDirectory().add(new City("Boston", 3142L,new ArrayList<String>(Arrays.asList("Park Drive","Westland Avenue"))));
       
       cityDirectoryRef.getCityDirectory().add(new City("New York", 3145L, 
              new ArrayList<String>(Arrays.asList("Times Square","Brooklyn"))));
       
       communityDirectoryRef.getCommunityDirectory().add(new Community(2134L, "Park Drive", 2115L));
       
       communityDirectoryRef.getCommunityDirectory().add(new Community(2135L, "Westland Avenue", 2119L));
       
       hospitalDirectoryRef.getHospitalDirectory().add( new Hospital (981L, "Boston Hospital", 2115L));
       
       hospitalDirectoryRef.getHospitalDirectory().add( new Hospital (982L, "Park Hospital", 2115L));
   
       hospitalDirectoryRef.getHospitalDirectory().add( new Hospital (986L, "Westland Hospital", 2119L));



    }
     
      
      
}
