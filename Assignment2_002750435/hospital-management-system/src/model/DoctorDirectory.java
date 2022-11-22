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
public class DoctorDirectory {
    
      private ArrayList<DoctorDetails> doctorDirectory;
      
      public DoctorDirectory(){
        this.doctorDirectory = new ArrayList<>();
    }

    public ArrayList<DoctorDetails> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<DoctorDetails> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    
}
