package com.shimadove.springsecurityseries.service;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserResponseDTO;
import com.shimadove.springsecurityseries.exception.UserAlreadyExistException;

public interface IUserService {
    UserResponseDTO registerNewUserAccount(UserDTO userDto) throws UserAlreadyExistException;
}
