package com.example.mmc.website.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Winner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String wonItem;

    // Constructors
    public Winner() {}

    public Winner(String userName, String wonItem) {
        this.userName = userName;
        this.wonItem = wonItem;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getWonItem() {
        return wonItem;
    }

    public void setWonItem(String wonItem) {
        this.wonItem = wonItem;
    }
}
