package com.shimadove.springsecurityseries.configuration;

import com.shimadove.springsecurityseries.security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    private final MyUserDetailsService userDetailsService;

    @Autowired
    public MyConfiguration(MyUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService);
//    }
}
