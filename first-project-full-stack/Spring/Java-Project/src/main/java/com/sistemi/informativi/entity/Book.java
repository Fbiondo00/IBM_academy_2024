package com.sistemi.informativi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    @Column(length = 13)
    private String isbn;

    private String title;

    private String genre;

    private boolean published;
    @ManyToOne
    private Profile profile;

    public Book() {}

    public Book(String isbn, String title, String genre, boolean published, Profile profile) {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
        this.published = published;
        this.profile = profile;

    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean published) {
        this.published = published;
    }
}
