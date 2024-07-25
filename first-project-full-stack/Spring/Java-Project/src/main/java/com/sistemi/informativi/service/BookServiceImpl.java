package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.repository.BookRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class BookServiceImpl implements BookService{

    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();

        try {
            books= bookRepository.findAll();

        }
        catch (Exception  ex){
            ex.printStackTrace();
        }
        return books;
    }

    @Override
    public Book saveOrUpdateBook(Book book) {
        try {
            bookRepository.save(book);
        }
        catch(Exception ex) {
            ex.printStackTrace();

        }
        return book;
    }

    @Override
    public Book findBookById(String isbn) {
        return bookRepository.findById(isbn).orElseThrow(()->new EntityNotFoundException("code not found"));    }

    @Override
    public Book removeBookById(String isbn) {

        try {
            bookRepository.deleteById(isbn);
        }
        catch(Exception ex) {
            ex.printStackTrace();

        }
        Map<String, Boolean> map= new HashMap<>();
        map.put(isbn + "elimination", true );
        return (Book) map;    }



}