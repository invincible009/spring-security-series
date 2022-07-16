package com.shimadove.springsecurityseries.service.impl;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserRegistrationResponseDTO;
import com.shimadove.springsecurityseries.entity.UserPojo;
import com.shimadove.springsecurityseries.exception.UserAlreadyExistException;
import com.shimadove.springsecurityseries.mappers.UserMapper;
import com.shimadove.springsecurityseries.repo.SalesRepository;
import com.shimadove.springsecurityseries.repo.UserRepository;
import com.shimadove.springsecurityseries.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final UserRepository userRepository;

    private final SalesRepository salesRepository;

    private final UserMapper userMapper;


    public UserService(UserRepository userRepository, SalesRepository salesRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.salesRepository = salesRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserRegistrationResponseDTO registerNewUserAccount(UserDTO userDto) throws UserAlreadyExistException {
        if (emailExists(userDto.getEmail())) {
            throw new UserAlreadyExistException("There is an account with that email address: "
                    + userDto.getEmail());
        }

        UserPojo user = new UserPojo();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPassword(userDto.getPassword());
        user.setEmail(userDto.getEmail());
//        user.setRoles(Arrays.asList("ROLE_USER"));

        return userMapper.registerUser(userRepository.save(user));
    }


    private boolean emailExists(String email) {
        return userRepository.findByEmail(email) != null;
    }
}
