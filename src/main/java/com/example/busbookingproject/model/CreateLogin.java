package com.example.busbookingproject.model;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="customerdetails")
public class CreateLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customerid",nullable = false)
    private Long customerId;
    @Column(name="customername",nullable = false ,length = 40)
    private String customerName;
    @Column(name="customerpassword",nullable = false)
    private String password;
    @Column(name="customeremail",nullable = false,length = 70)
    private String customerEmail;

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public CreateLogin() {
        super();
    }

    public CreateLogin(Long customerId, String customerName, String password, String customerEmail) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.customerEmail = customerEmail;
    }

}
