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
public class EncounterHistory {
          private ArrayList<EncounterDetails> encounterHistory;
      public EncounterHistory(){
        this.encounterHistory = new ArrayList<>();
    }

    public ArrayList<EncounterDetails> getEncounterDirectory() {
        return encounterHistory;
    }

    public void setEncounterDirectory(ArrayList<EncounterDetails> encounterDirectory) {
        this.encounterHistory = encounterDirectory;
    }
    
}
