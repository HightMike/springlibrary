package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.borisov.library.springlibrary.entities.Publisher;

@Repository

public interface PublisherRepository extends JpaRepository<Publisher, String> {
}
