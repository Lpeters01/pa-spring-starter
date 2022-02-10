package com.galvanize.tmo.paspringstarter.Service;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.galvanize.tmo.paspringstarter.model.Books;
import com.galvanize.tmo.paspringstarter.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @JsonProperty("books")
    private final BookDao bookDao;

    @Autowired
    public BookService(@Qualifier("dao") BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Books addBook(Books books){
        return bookDao.insertBook(books);
    }
    @JsonProperty("books")
    public List<Books> getAllBooks(){
        return bookDao.viewAllBooks();
    }

    public Optional<Books> getBookById(Long id){
        return bookDao.selectBookById(id);
    }

    public int clearLib(){
        return bookDao.deleteAllBooks();
    }

}
