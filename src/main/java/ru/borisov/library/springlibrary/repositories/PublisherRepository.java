package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.borisov.library.springlibrary.entities.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, String> {
}
