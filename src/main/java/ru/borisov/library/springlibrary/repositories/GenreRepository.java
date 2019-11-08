package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.borisov.library.springlibrary.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, String> {
}
