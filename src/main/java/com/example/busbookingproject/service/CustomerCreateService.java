package com.example.busbookingproject.service;

import com.example.busbookingproject.model.CreateLogin;
import com.example.busbookingproject.repository.CustomerCreateRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerCreateService {
    private final CustomerCreateRepository customerCreateRepository;
    private final PasswordEncoder passwordEncoder;

    public CustomerCreateService(CustomerCreateRepository customerCreateRepository, PasswordEncoder passwordEncoder) {
        this.customerCreateRepository = customerCreateRepository;
        this.passwordEncoder = passwordEncoder;
    }
    //Encoder to encode the password
    public CreateLogin saveDetails(CreateLogin createLogin){
        String encryptedPassword= passwordEncoder.encode(createLogin.getPassword());
        createLogin.setPassword(encryptedPassword);
        customerCreateRepository.save(createLogin);
        return createLogin;
    }


    public List<CreateLogin> getAll(){
        return customerCreateRepository.findAll();
    }

}
