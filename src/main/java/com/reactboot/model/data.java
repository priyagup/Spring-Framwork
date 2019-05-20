package com.reactboot.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class data{

    // @GeneratedValue(strategy = GenerationType.AUTO)
    // @Column(name = "dataID")
    private Integer dataID;
    // @Column(name = "groupName")
    private String groupName;
    // @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue
    public int getDataID() {
        return this.dataID;
    }

    public void setDataID(Integer dataID) {
        this.dataID = dataID;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}