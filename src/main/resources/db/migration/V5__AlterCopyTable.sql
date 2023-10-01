ALTER TABLE copy
ADD CONSTRAINT fk_book_id FOREIGN KEY (book_id) REFERENCES book (id);