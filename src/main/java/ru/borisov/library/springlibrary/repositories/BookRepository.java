package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.borisov.library.springlibrary.entities.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}
