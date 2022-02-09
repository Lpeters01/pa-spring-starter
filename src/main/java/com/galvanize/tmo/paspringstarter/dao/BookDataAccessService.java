package com.galvanize.tmo.paspringstarter.dao;

import com.galvanize.tmo.paspringstarter.model.Books;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository("dao")
public class BookDataAccessService implements BookDao {

    private static List<Books> DB = new ArrayList<>();

    @Override
    public int insertBook( Books books) {
        if (books.getId() == null){
            books.setId((long) DB.size() +1);
        }
        DB.add(new Books(books.getId(), books.getAuthor(), books.getTitle(), books.getYearPublished()));
        return books.getId().intValue();
    }


    @Override
    public List<Books> viewAllBooks() {
        return DB.stream()
                .sorted(Comparator.comparing(Books::getTitle))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Books> selectBookById(Long id) {
        return DB.stream()
                .filter(books -> books.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteAllBooks() {
        DB.clear();
        return 1;
    }


}
