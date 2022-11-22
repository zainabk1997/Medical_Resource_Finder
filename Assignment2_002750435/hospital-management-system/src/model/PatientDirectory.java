/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
/**
 *
 * @author zainabkhokawala
 */
public class PatientDirectory {
    
       private ArrayList<PatientDetails> patientDirectory;
    
    public PatientDirectory(){
        this.patientDirectory = new ArrayList<>();
    }

    public ArrayList<PatientDetails> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(ArrayList<PatientDetails> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    
//    public PatientDetails addNewPatient(){
//        PatientDetails newPatient = new PatientDetails();
//        patientDirectory.add(newPatient);
//        return newPatient;
//    }
    
}
