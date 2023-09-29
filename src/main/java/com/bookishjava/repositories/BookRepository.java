package com.bookishjava.repositories;

import com.bookishjava.models.database.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByTitle(String title);

    //it sees findByTitle, it reads its text, find is a key -> find in book by Author, it means:
    //SELECT * FROM book WHERE title = this.title;

    //basically interfaces are going to create the methods to query
}
