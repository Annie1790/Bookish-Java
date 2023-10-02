ALTER TABLE copy
DROP CONSTRAINT fk_user_id;

ALTER TABLE copy
DROP CONSTRAINT fk_book_id;

ALTER TABLE copy
ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES reader (id) ON UPDATE CASCADE ON DELETE CASCADE;

ALTER TABLE copy
ADD CONSTRAINT fk_book_id FOREIGN KEY (book_id) REFERENCES book (id) ON UPDATE CASCADE ON DELETE CASCADE;