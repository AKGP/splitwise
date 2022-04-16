package com.scaler.splitwise.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name="GROUPS")
public class Group extends BaseModel {
    private String name;

    @ManyToMany
    private List<User> users = new ArrayList<User>();

    @ManyToMany
    private List<User> admins = new ArrayList<User>();



}
