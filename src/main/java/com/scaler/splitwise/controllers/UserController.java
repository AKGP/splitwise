package com.scaler.splitwise.controllers;


import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.ResponseDTO;
import com.scaler.splitwise.dtos.UserDTO;
import com.scaler.splitwise.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user")
    public UserDTO createUser(@RequestBody CreateUserDTO userObject){
        return userService.createUser(userObject);
    }


    @GetMapping("/user/{userId}")
    public ResponseDTO<UserDTO> getUser(@PathVariable Long userId){
        return userService.getUser(userId);
    }


}
