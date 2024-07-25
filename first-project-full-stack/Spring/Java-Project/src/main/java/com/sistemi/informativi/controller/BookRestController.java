package com.sistemi.informativi.controller;

import com.sistemi.informativi.entity.Book;
import com.sistemi.informativi.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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