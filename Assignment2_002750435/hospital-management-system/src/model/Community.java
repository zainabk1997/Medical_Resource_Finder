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
public class Community {
    
    private long communityID;
    private String communityName;
    private long communityZip;

    public Community(long communityID, String communityName, long communityZip) {
        this.communityID = communityID;
        this.communityName = communityName;
        this.communityZip = communityZip;
    }

    public long getCommunityID() {
        return communityID;
    }

    public void setCommunityID(long communityID) {
        this.communityID = communityID;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public long getCommunityZip() {
        return communityZip;
    }

    public void setCommunityZip(long communityZip) {
        this.communityZip = communityZip;
    }
   

    
}
