package com.bookishjava.models.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Copy {
    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    //@foreign key
    private int book_id;
    private int user_id;
    public boolean is_available;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int bookId) {
        this.book_id = bookId;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int userId) {
        this.user_id = userId;
    }

    public boolean getIsAvailable() {
        return is_available;
    }

    public void setIsAvailable() {
        this.is_available = !this.is_available;
    }

    }

