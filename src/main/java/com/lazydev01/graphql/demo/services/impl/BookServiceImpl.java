package com.lazydev01.graphql.demo.services.impl;

import com.lazydev01.graphql.demo.models.Book;
import com.lazydev01.graphql.demo.reposities.BookRepository;
import com.lazydev01.graphql.demo.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Book create(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book Not Found"));
    }
}
