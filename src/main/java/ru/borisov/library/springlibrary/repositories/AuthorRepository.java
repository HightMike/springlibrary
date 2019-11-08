package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.borisov.library.springlibrary.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {



}
