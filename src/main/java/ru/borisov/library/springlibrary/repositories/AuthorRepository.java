package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov.library.springlibrary.entities.Author;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

    List<Author> findByFioContainingIgnoreCaseOrderByFio (String fio); // дополнительный метод (помимо Crud операций, дописываем такой)

    Page<Author> findByFioContainingIgnoreCaseOrderByFio (String fio, Pageable pageable);

}

