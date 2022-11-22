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
public class City {
    
    private String name;
    private Long cityID;
    private ArrayList<String> communityNames;
    
    public City(String name, long cityID, ArrayList<String> communityNames ){
        this.name = name;  
        this.cityID = cityID;
        this.communityNames = communityNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getCommunityNames() {
        return communityNames;
    }

    public void setCommunityNames(ArrayList<String> communityNames) {
        this.communityNames = communityNames;
    }

    public Long getCityID() {
        return cityID;
    }

    public void setCityID(Long cityID) {
        this.cityID = cityID;
    }

    
}
