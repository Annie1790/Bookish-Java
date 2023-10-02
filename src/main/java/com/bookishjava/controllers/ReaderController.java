package com.bookishjava.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.bookishjava.models.database.Reader;
import com.bookishjava.repositories.ReaderRepository;

@CrossOrigin
@RestController
@RequestMapping("/member")
public class ReaderController {

    private final ReaderRepository repository;

    ReaderController(ReaderRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/all")
    List<Reader> getAllReaders() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    Optional<Reader> getReaderById(@PathVariable String username) {
        return Optional.ofNullable(repository.findByUsername(username));
    }
}
