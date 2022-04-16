package com.scaler.splitwise.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;


@Data
@Entity
@Table(name = "USERS")
public class User extends BaseModel{
    private String name;
    private String mobileNumber;
    private String email;
    private String hashedPass;
}
