package com.example.busbookingproject.service;

import com.example.busbookingproject.model.FileUploadModel;
import com.example.busbookingproject.repository.FIleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOError;
import java.io.IOException;

@Service
public class FIleHandlingService {
    private final FIleRepository fIleRepository ;
   @Autowired
   public FIleHandlingService(FIleRepository fIleRepository) {
       this.fIleRepository= fIleRepository;
   }


    public FileUploadModel save(MultipartFile file ) throws IOError, IOException {
       String filename=file.getOriginalFilename();
       System.out.println(filename);
       String filelocation="D:\\RestApi"+filename;
       file.transferTo(new File(filelocation));
        FileUploadModel fileUploadModel = new FileUploadModel();
        fileUploadModel.setFilename(filename);
        fileUploadModel.setFilelocation(filelocation);
       return fIleRepository.save(fileUploadModel);
    }
}
