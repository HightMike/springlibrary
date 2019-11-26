package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.borisov.library.springlibrary.entities.Author;
import ru.borisov.library.springlibrary.entities.Genre;
import ru.borisov.library.springlibrary.repositories.GenreRepository;

import java.util.List;

public class GenreService implements BasicService<Genre> {

    private GenreRepository genreRepository;

    @Autowired
    public void setGenreRepository(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<Genre> getall() {
        return genreRepository.findAll();
    }

    @Override
    public List<Genre> search(String... searchString) {
        return null;
    }

    @Override
    public Genre get(long id){
        return genreRepository.getOne(id);
    }

    @Override
    public Genre save(Genre obj) {
        return null;
    }

    @Override
    public void delete(Genre object) {

    }

    public List<Genre> findByName(String name) {
        return genreRepository.findByNameContainingIgnoreCaseOrderByName(name);
    }

}
