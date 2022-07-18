package com.shimadove.springsecurityseries.service.impl;

import com.shimadove.springsecurityseries.entity.Customer;
import com.shimadove.springsecurityseries.repo.CustomerRepository;
import com.shimadove.springsecurityseries.security.SecurityCustomer;
import com.shimadove.springsecurityseries.service.IUserDetailService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IUserDetailServiceImpl implements IUserDetailService, UserDetailsService {

    private final CustomerRepository custRepository;

    public IUserDetailServiceImpl(CustomerRepository custRepository) {
        this.custRepository = custRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = custRepository.findByEmail(username);
        if(customer.size() == 0 ){
            throw new UsernameNotFoundException("user details not found for the user : "+ username);
        }
        return new SecurityCustomer(customer.get(0));
    }
}
