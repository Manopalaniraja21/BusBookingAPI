package com.example.busbookingproject.controller;

import com.example.busbookingproject.model.CreateLogin;
import com.example.busbookingproject.service.CustomerCreateService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/create")
@CrossOrigin(value="http://localhost:5173/")
public class CustomerCreateController {
    private final CustomerCreateService customerCreateService;

    public CustomerCreateController(CustomerCreateService customerCreateService) {
        this.customerCreateService = customerCreateService;
    }


@GetMapping("/getAll")
public List<CreateLogin> getAll(){
        return customerCreateService.getAll();

}    @PostMapping("/create-login")
    public ResponseEntity<CreateLogin>createLogin(@RequestBody CreateLogin createLogin){
        CreateLogin savedLogin=customerCreateService.saveDetails(createLogin);
        return new ResponseEntity<>(savedLogin, HttpStatus.CREATED);

    }
}
