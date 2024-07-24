package com.sistemi.informativi.service;

import com.sistemi.informativi.entity.Book;

import java.util.List;

public interface BookService {

    public List<Book> getBooks() ;

    public Book findBookById(String isbn);

    public Book saveOrUpdateBook(Book book) ;

    public Book removeBookById(String isbn);


}
