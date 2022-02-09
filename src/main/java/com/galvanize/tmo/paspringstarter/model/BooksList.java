package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class BooksList {

@JsonProperty("books")
   private List<com.galvanize.tmo.paspringstarter.model.Books> Books = new ArrayList<>();

    public List<com.galvanize.tmo.paspringstarter.model.Books> getBooks() {
        return Books;
    }

    public void setBooks(List<com.galvanize.tmo.paspringstarter.model.Books> books) {
        Books = books;
    }

    public BooksList(List<com.galvanize.tmo.paspringstarter.model.Books> books) {
        Books = books;
    }
}
