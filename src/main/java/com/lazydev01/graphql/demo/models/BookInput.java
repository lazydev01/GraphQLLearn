package com.lazydev01.graphql.demo.models;


import lombok.Data;

@Data
public class BookInput {
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;
}
