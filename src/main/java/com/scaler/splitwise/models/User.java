package com.scaler.splitwise.models;

import com.scaler.splitwise.dtos.CreateUserDTO;
import lombok.Data;

import javax.persistence.*;

@Data /* for getter and setter*/
@Entity /* for Entity*/
@Table(name = "USERS") /* for DB*/
public class User extends BaseModel{
    private String name;
    private String email;
    private String mobile;
    private String hashedPass;


    public static User from(CreateUserDTO createUserDTO, String hashedPass){
        User user = new User();
        user.setName(createUserDTO.getName());
        user.setMobile(createUserDTO.getMobile());
        user.setHashedPass(hashedPass);
        return user;
    }
}
