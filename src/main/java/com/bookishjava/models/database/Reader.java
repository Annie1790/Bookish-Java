package com.bookishjava.models.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reader {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {this.username = name;}

    public Long getId() {return this.id;}

}
