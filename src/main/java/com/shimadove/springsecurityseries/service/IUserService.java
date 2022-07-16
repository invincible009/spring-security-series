package com.shimadove.springsecurityseries.service;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserRegistrationResponseDTO;
import com.shimadove.springsecurityseries.exception.UserAlreadyExistException;

public interface IUserService {
    UserRegistrationResponseDTO registerNewUserAccount(UserDTO userDto) throws UserAlreadyExistException;
}
