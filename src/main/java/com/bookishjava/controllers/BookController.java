package com.bookishjava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.bookishjava.models.database.Book;
import com.bookishjava.repositories.BookRepository;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/books")
//base path
public class BookController {
    private final BookRepository repository;

    BookController(BookRepository repository) {
        this.repository = repository;
    }

    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/all")
    List<Book> getBooks() {
        return repository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/get-book-id/{id}")
    Optional<Book> getBookId(@PathVariable Long id) {
        if (id != null) {
            return repository.findById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }
    @CrossOrigin(origins = "http://localhost:5173")
    @PostMapping("/new-book")
    public Book saveBook(@Validated @RequestBody Book newBook) {
        return repository.save(newBook);
    }

}
