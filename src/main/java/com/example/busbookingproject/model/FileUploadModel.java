package com.example.busbookingproject.model;

import jakarta.persistence.*;

@Entity
@Table(name="fileupload")
public class FileUploadModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fileid;
    @Column(name="filename")
    private String filename;

    @Column(name="filelocation")
    private String filelocation;
    public FileUploadModel(Long fileid, String filename, String filelocation) {
        this.fileid = fileid;
        this.filename = filename;
        this.filelocation = filelocation;
    }

    public Long getFileid() {
        return fileid;
    }

    public void setFileid(Long fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilelocation() {
        return filelocation;
    }

    public void setFilelocation(String filelocation) {
        this.filelocation = filelocation;
    }

    public FileUploadModel() {
        super();
    }




}
