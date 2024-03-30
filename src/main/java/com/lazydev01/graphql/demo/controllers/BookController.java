package com.lazydev01.graphql.demo.controllers;

import com.lazydev01.graphql.demo.models.Book;
import com.lazydev01.graphql.demo.models.BookInput;
import com.lazydev01.graphql.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BookController {
    private BookService bookService;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    //Create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput bookInput){
        Book book = new Book();
        book.setTitle(bookInput.getTitle());
        book.setDesc(bookInput.getDesc());
        book.setAuthor(bookInput.getAuthor());
        book.setPages(bookInput.getPages());
        book.setPrice(bookInput.getPrice());
        return this.bookService.create(book);
    }
    //Get All
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    //Get Single Book
    @QueryMapping("getBook")
    public Book get(@Argument(value = "id") int bookId){
        return this.bookService.get(bookId);
    }

}
