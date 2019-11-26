package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> search(String... searchString) {
        return null;
    }

    @Override
    public Author save(Author obj) {
        return null;
    }


    public List<Author> findByFio(String fio) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(fio);
    }

    public Page<Author> getPageList(String fio, Pageable pageable) {
        return authorRepository.findByFioContainingIgnoreCaseOrderByFio(fio, pageable);
    }

    @Override
    public void delete(Author object) {

    }
}
