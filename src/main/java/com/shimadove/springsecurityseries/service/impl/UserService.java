package com.shimadove.springsecurityseries.service.impl;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserResponseDTO;
import com.shimadove.springsecurityseries.entity.UserPojo;
import com.shimadove.springsecurityseries.repo.UserRepository;
import com.shimadove.springsecurityseries.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserResponseDTO registerNewUserAccount(UserDTO userDto) throws UserAlreadyExistException {
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + userDto.getEmail());
        }

        UserPojo user = new UserPojo();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
        user.setRoles(Arrays.asList("ROLE_USER"));

        return userRepository.save(user); // mapp out the approperiate dto response
    }


    private boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
