package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.borisov.library.springlibrary.entities.Author;
import ru.borisov.library.springlibrary.entities.Book;
import ru.borisov.library.springlibrary.entities.Genre;

import java.util.List;

public interface BasicService<T> {

    public List<T> getall();

    public T get(long id);

    public T save(T obj);

    public void delete(T object);

}
