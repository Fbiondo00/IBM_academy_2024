package com.sistemi.informativi.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Profile {

    @Id
    @Column(length = 13)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String id;

    private String firstName;

    private String lastName;
    @OneToMany(mappedBy = "isbn", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Book> books = new ArrayList<>();

   protected Profile() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return firstName;
    }

    public void setName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Profile(String id, String name, String lastName, List<Book> books) {
        this.id = id;
        this.firstName = name;
        this.lastName = lastName;
        this.books = books;
    }
}
