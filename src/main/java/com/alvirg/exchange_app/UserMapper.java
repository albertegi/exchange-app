package com.alvirg.exchange_app;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserMapper {

    public static UserEntity fromCreateDto(CreateUserDTO dto){
        if(dto == null){
            throw new NullPointerException("User dto should not be null");
        }

        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(dto.getFirstName());
        userEntity.setLastName(dto.getLastName());
        userEntity.setEmail(dto.getEmail());
        userEntity.setPassword(dto.getPassword());

        return userEntity;
    }

    public static UserEntity fromUpdateUserDto(UpdateUserDTO dto, UserEntity existing){
        if(dto == null && existing == null) return existing;

        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setEmail(dto.getEmail());

        return existing;
    }

    public static UserResponseDTO toUserResponseDTO(UserEntity userEntity){

        if(userEntity == null){
            return null;
        }

        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(userEntity.getId());
        dto.setFirstName(userEntity.getFirstName());
        dto.setLastName(userEntity.getLastName());
        dto.setEmail(userEntity.getEmail());
        return dto;

    }
}
