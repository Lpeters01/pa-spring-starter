package com.galvanize.tmo.paspringstarter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.concurrent.atomic.AtomicLong;


public class Book {


    private Long id;
    private final String author;
    private final String title;
    private final Integer yearPublished;



    public Book(@JsonProperty("id") Long id,
                @JsonProperty("author") String author,
                @JsonProperty("title") String title,
                @JsonProperty("yearPublished") Integer yearPublished) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
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
