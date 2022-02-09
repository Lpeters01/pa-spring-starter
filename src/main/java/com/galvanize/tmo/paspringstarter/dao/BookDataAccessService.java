package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository("dao")
public class BookDataAccessService implements BookDao {

    private static List<Book> DB = new ArrayList<>();

    @Override
    public int insertBook(Integer id, Book book) {
        if (book.getId() == null){
            id = 1;
        }
        DB.add(new Book(id, book.getAuthor(), book.getTitle(), book.getYearPublished()));
        return 1;
    }


    @Override
    public List<Book> viewAllBooks() {
        return DB.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Book> selectBookById(Integer id) {
        return DB.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteAllBooks() {
        DB.clear();
        return 1;
    }


}
