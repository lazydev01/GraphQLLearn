package com.lazydev01.graphql.demo.services;

import com.lazydev01.graphql.demo.models.Book;

import java.util.List;

public interface BookService {
    //Create
    Book create(Book book);

    //Get All
    List<Book> getAll();

    //Get Single Book
    Book get(int bookId);


}
