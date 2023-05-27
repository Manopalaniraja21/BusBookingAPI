package com.example.busbookingproject.controller;

import com.example.busbookingproject.model.AuthenticateRequest;
import com.example.busbookingproject.service.CustomerCreateService;
import com.example.busbookingproject.service.LoginUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@CrossOrigin(value="http://localhost:5173/")
public class LoginUserController {
    private final LoginUserService loginUserService;

    public LoginUserController(LoginUserService loginUserService) {
        this.loginUserService = loginUserService;
    }
    @GetMapping("/")
    public String Welcome(){
        return "It is working fine";
    }
    @PostMapping("/authenticate")
    public ResponseEntity<?> authenticateUser(@RequestBody AuthenticateRequest authenticateRequest) {
        String username = authenticateRequest.getUsername();
        String password = authenticateRequest.getPassword();
       if( loginUserService.authenticateUser(username,password)){
           System.out.println("Authenticated");
           return ResponseEntity.ok().body("Authentication successful");


       }return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");

    }
}
