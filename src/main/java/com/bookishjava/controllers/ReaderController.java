package com.bookishjava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookishjava.models.database.Reader;
import com.bookishjava.repositories.ReaderRepository;

@RestController
public class ReaderController {

    private final ReaderRepository repository;

    ReaderController(ReaderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/reader")
    List<Reader> getAllReaders() {
        return repository.findAll();
    }

    @GetMapping("/reader/{id}")
    Optional<Reader> getReaderById(@PathVariable Long id) {
        return repository.findById(id);
    }
}
