ALTER TABLE copy
ADD CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES reader (id);