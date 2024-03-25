package com.lazydev01.graphql.demo.controllers;

import com.lazydev01.graphql.demo.models.Book;
import com.lazydev01.graphql.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    //Create
    @PostMapping
    public Book create(@RequestBody  Book book){
        return this.bookService.create(book);
    }
    //Get All
    @GetMapping
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    //Get Single Book
    @GetMapping("/{id}")
    public Book get(@PathVariable(value = "id") int bookId){
        return this.bookService.get(bookId);
    }

}
