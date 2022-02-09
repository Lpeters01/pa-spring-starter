package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    int insertBook(Integer id, Book book);

    default int insertBook(Book book){
        Integer id = book.getId();
        return insertBook( id, book);
    }

    List<Book> viewAllBooks();

    Optional<Book> selectBookById(Integer id);

    int deleteAllBooks();

}
