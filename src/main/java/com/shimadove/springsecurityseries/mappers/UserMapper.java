package com.shimadove.springsecurityseries.mappers;

import com.shimadove.springsecurityseries.dtos.UserRegistrationResponseDTO;
import com.shimadove.springsecurityseries.entity.UserPojo;

public class UserMapper {

    public UserRegistrationResponseDTO registerUser(UserPojo save) {
        UserRegistrationResponseDTO responseDTO = new UserRegistrationResponseDTO();
        responseDTO.setEmail(save.getEmail());
        return responseDTO;
    }
}
