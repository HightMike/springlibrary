package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.borisov.library.springlibrary.entities.Author;
import ru.borisov.library.springlibrary.entities.Genre;
import ru.borisov.library.springlibrary.repositories.AuthorRepository;

import java.util.List;


@Service
public class AuthorService implements BasicService<Author>{

    private AuthorRepository authorRepository;

    @Autowired
    public void setAuthorRepository(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public List<Author> getall() {
        return authorRepository.findAll();
    }

    @Override
    public Author get(long id) {
        return authorRepository.getOne(String.valueOf(id));
    }

    @Override
    public Author save(Author obj) {
        return null;
    }

    @Override
    public void delete(Author object) {
        return authorRepository.delete(object);
    }
}
