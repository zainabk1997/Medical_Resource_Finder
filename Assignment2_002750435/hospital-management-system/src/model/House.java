/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author zainabkhokawala
 */
public class House {
    
    private String streetAddress;
    private int houseNumber;
    private long houseZip;

    public House(String streetAddress, int houseNumber, long houseZip) {
        this.streetAddress = streetAddress;
        this.houseNumber = houseNumber;
        this.houseZip = houseZip;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public long getHouseZip() {
        return houseZip;
    }

    public void setHouseZip(long houseZip) {
        this.houseZip = houseZip;
    }
    
    
    
    
    
}
