package com.example.busbookingproject.repository;

import com.example.busbookingproject.model.CreateLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerCreateRepository extends JpaRepository<CreateLogin,Long> {
    CreateLogin findByCustomerName(String username);
}
