package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.borisov.library.springlibrary.entities.Publisher;
import ru.borisov.library.springlibrary.entities.Genre;
import ru.borisov.library.springlibrary.repositories.PublisherRepository;

import java.util.List;

@Service
public class PublisherService implements BasicService<Publisher>{

    private PublisherRepository publisherRepository;

    @Autowired
    public void setPublisherRepository(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public List<Publisher> getall() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher get(long id){
        return publisherRepository.getOne(id);
    }

    @Override
    public Publisher save(Publisher obj) {
        return null;
    }

    @Override
    public void delete(Publisher object) {

    }

    public List<Publisher> search(String... searchString) {
        return publisherRepository.findAll();
    }

    public List<Publisher> findByName(String name) {
        return publisherRepository.findByNameContainingIgnoreCaseOrderByName(name);
    }

}
