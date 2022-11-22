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
public class PersonDirectory {
    
    private ArrayList<PersonDetails> personDirectory;
    
    public PersonDirectory(){
        this.personDirectory = new ArrayList<>();
    }

    public ArrayList<PersonDetails> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(ArrayList<PersonDetails> personDirectory) {
        this.personDirectory = personDirectory;
    }

}
