package com.alvirg.exchange_app;

import com.alvirg.exchange_app.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private UserMapper userMapper;

    public UserResponseDTO createUser(CreateUserDTO dto){

       UserEntity user = userMapper.fromCreateDto(dto);
       var savedUser = userRepository.save(user);
       return userMapper.toUserResponseDTO(savedUser);
    }
}
