package com.galvanize.tmo.paspringstarter.api;

import com.galvanize.tmo.paspringstarter.model.Books;
import com.galvanize.tmo.paspringstarter.Service.BookService;
import com.galvanize.tmo.paspringstarter.model.BooksList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/books")
@RestController
public class LibraryController {

    private final BookService bookService;

    @Autowired
    public LibraryController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Object> addBook(@RequestBody Books books){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.addBook(books));
    }

    @GetMapping
    public BooksList getAllBooks(){
        return new BooksList(bookService.getAllBooks());
    }

    @GetMapping(path = "{id}")
    public Books getBookById(@PathVariable("id") Long id){
        return bookService.getBookById(id)
                .orElse(null);
    }

    @DeleteMapping
    public ResponseEntity<Integer> nothingsHere(){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(bookService.clearLib());
    }

}
