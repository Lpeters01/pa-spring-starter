package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Book {

    private static int count = 0;
    private final Integer id;
    private final String author;
    private final String title;
    private final Integer yearPublished;



    public Book(@JsonProperty("id") Integer id,
                @JsonProperty("author") String author,
                @JsonProperty("title") String title,
                @JsonProperty("yearPublished") Integer yearPublished) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }


    public Integer getId() {
        return id;
    }


    public String getAuthor() {
        return author;
    }


    public String getTitle() {
        return title;
    }


    public Integer getYearPublished() {
        return yearPublished;
    }



}
