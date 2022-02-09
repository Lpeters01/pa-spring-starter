package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    int insertBook(Book book);


    List<Book> viewAllBooks();

    Optional<Book> selectBookById(Long id);

    int deleteAllBooks();

}
