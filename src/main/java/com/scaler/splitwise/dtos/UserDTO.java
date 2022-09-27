package com.scaler.splitwise.dtos;

import com.scaler.splitwise.models.User;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private Long id;
    private String name;
    private String mobile;
    private String email;

    public static UserDTO from(User user){
        return UserDTO.builder()
                .name(user.getName())
                .mobile(user.getMobile())
                .email(user.getEmail())
                .id(user.getId())
                .build();
    }
}
