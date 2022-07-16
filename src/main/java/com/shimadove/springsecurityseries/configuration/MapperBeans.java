package com.shimadove.springsecurityseries.configuration;

import com.shimadove.springsecurityseries.mappers.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperBeans {

    @Bean
    public UserMapper mapper (){
        return new UserMapper();    }

}
