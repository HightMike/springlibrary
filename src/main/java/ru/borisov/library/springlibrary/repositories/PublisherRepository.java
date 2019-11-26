package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov.library.springlibrary.entities.Publisher;

import java.util.List;

@Repository

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

    List<Publisher> findByNameContainingIgnoreCaseOrderByName (String name); // дополнительный метод (помимо Crud операций, дописываем такой)


}
