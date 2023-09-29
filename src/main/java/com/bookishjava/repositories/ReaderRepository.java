package com.bookishjava.repositories;
import com.bookishjava.models.database.Reader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository extends JpaRepository<Reader, Long> {
    Reader findByUsername(String username);
}
