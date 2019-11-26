package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov.library.springlibrary.entities.Genre;

import java.util.List;

@Repository

public interface GenreRepository extends JpaRepository<Genre, Long> {

    List<Genre> findByNameContainingIgnoreCaseOrderByName (String name); // дополнительный метод (помимо Crud операций, дописываем такой)

}
