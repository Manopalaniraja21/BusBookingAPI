package com.example.busbookingproject.controller;

import com.example.busbookingproject.service.FIleHandlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/apipload")
public class FileHandlingController {
    private final FIleHandlingService fIleHandlingService;
   @Autowired
    public FileHandlingController(FIleHandlingService fIleHandlingService) {
        this.fIleHandlingService = fIleHandlingService;
    }
    @PostMapping("/upload")
    public ResponseEntity<String>fileUpload(@RequestParam ("file")MultipartFile multipartFile){
        try {
            fIleHandlingService.save(multipartFile);
            return ResponseEntity.ok("File uploaded successfully");
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload file");
        }
    }
}
