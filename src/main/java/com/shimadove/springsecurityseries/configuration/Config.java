package com.shimadove.springsecurityseries.configuration;

import com.shimadove.springsecurityseries.repo.UserRepository;
import com.shimadove.springsecurityseries.security.MyUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private UserRepository repository;
    @Bean
    public MyUserDetailsService userDetailsService(){

        return new MyUserDetailsService(repository);
    }
}
