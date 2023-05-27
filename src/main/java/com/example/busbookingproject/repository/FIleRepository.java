package com.example.busbookingproject.repository;

import com.example.busbookingproject.model.FileUploadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FIleRepository extends JpaRepository<FileUploadModel, Long> {

}
