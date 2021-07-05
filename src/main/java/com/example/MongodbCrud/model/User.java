package com.example.MongodbCrud.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;
    private String name;
    private String email;
    private String ProfilePhotoUrl;

    public User(String name, String email, String profilePhotoUrl) {
        this.name = name;
        this.email = email;
        ProfilePhotoUrl = profilePhotoUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfilePhotoUrl() {
        return ProfilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        ProfilePhotoUrl = profilePhotoUrl;
    }
}
