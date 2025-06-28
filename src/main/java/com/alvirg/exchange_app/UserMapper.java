package com.alvirg.exchange_app;

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
}
