package com.example.SoccerLeauge.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Player {

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String position;
    private String photoPath;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String setPosition(String position) {
        this.position = position;
        return position;
    }

    public String setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
        return photoPath;
    }

    // Getters and setters

}
