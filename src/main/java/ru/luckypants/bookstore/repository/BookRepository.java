package ru.luckypants.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.luckypants.bookstore.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
