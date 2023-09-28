CREATE TABLE copy (
    id SERIAL PRIMARY KEY,
    book_id INT,
    user_id INT,
    is_available BOOLEAN
);