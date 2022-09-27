package com.scaler.splitwise.services;

import com.scaler.splitwise.dtos.CreateUserDTO;
import com.scaler.splitwise.dtos.ResponseDTO;
import com.scaler.splitwise.dtos.UserDTO;
import com.scaler.splitwise.models.User;
import com.scaler.splitwise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Autowired
    private UserRepository userRepository;
    public UserDTO createUser(CreateUserDTO userObject){
        String hashedPassword = passwordEncoder.encode(userObject.getPassword());
        User newUser = User.from(userObject, hashedPassword);
        User createdUser = userRepository.save(newUser);
        return UserDTO.from(createdUser);
    }


    public ResponseDTO<UserDTO> getUser(Long userId){
       Optional<User> users =  userRepository.findById(userId);
       Optional<UserDTO> userDto = users.map(UserDTO::from);
       return userDto.map(ResponseDTO::success).orElse(ResponseDTO.notFound());
    }
}
