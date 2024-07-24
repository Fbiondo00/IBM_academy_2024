package com.sistemi.informativi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.service.BookService;

@CrossOrigin
@RestController
@RequestMapping("/rest/api/books")
public class BookRestController {

    private BookService bookService;

    private BookRestController(BookService bookService) {

        this.bookService = bookService;
    }


    @GetMapping
    public List <Book> getBooks(){

        return bookService.getBooks();

    }



    @GetMapping("/isbn/{isbn}")
    public Book getBookById(@PathVariable String isbn) {

        return bookService.findBookById(isbn);

    }



    @PutMapping
    public Book updateBook(@RequestBody Book book) {

        return bookService.saveOrUpdateBook(book);

    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {

        return bookService.saveOrUpdateBook(book);

    }

    @DeleteMapping("/isbn/{isbn}")

    public Book removeBook(@PathVariable String isbn){
        return bookService.removeBookById(isbn);
    }

}