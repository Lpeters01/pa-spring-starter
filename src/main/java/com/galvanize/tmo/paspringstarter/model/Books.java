package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class Books {


   private List<Book> Book = new ArrayList<>();

    public List<Book> getBook() {
        return Book;
    }

    public void setBook(List<Book> book) {
        Book = book;
    }

    public Books(List<Book> book) {
        Book = book;
    }
}
