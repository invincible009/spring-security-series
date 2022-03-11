package com.shimadove.springsecurityseries.service;

import com.shimadove.springsecurityseries.dtos.UserDTO;
import com.shimadove.springsecurityseries.dtos.UserResponseDTO;

public interface IUserService {
    UserResponseDTO registerNewUserAccount(UserDTO userDto);
}
