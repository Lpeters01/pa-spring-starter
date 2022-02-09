package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Books;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    int insertBook(Books books);

    List<Books> viewAllBooks();

    Optional<Books> selectBookById(Long id);

    int deleteAllBooks();

}
