package com.reactboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class department {

    @Id
    @Column(name = "groupID")
    private Integer id;
    @Column(name = "name")
    private Integer groupName;

    public int getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getGroupName() {
        return this.groupName;
    }

    public void setGroupName(Integer groupName) {
        this.groupName = groupName;
    }

}