package com.example.busbookingproject.service;

import com.example.busbookingproject.model.CreateLogin;
import com.example.busbookingproject.repository.CustomerCreateRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginUserService {
    private final CustomerCreateRepository customerCreateRepository;
    private final PasswordEncoder passwordEncoder;

    public LoginUserService(CustomerCreateRepository customerCreateRepository, PasswordEncoder passwordEncoder) {
        this.customerCreateRepository = customerCreateRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public boolean authenticateUser(String username,String password) {
        CreateLogin rawpassword = customerCreateRepository.findByCustomerName(username);
        if (rawpassword != null ||password!=null) {
            System.out.println(passwordEncoder);
            System.out.println(password);
            return passwordEncoder.matches(password, rawpassword.getPassword());

        }else{
        return false;}

    }


    }
