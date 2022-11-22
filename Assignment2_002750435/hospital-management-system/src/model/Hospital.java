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
public class Hospital {
    
    private long hospitalID;
    private String hospitalName;
    private long communityZip;

    public Hospital(long hospitalID, String hospitalName, long communityZip) {
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
        this.communityZip = communityZip;
    }

    public long getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(long hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public long getCommunityZip() {
        return communityZip;
    }

    public void setCommunityZip(long communityZip) {
        this.communityZip = communityZip;
    }




    



}
