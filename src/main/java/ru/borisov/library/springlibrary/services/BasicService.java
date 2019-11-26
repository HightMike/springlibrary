package ru.borisov.library.springlibrary.services;

import java.util.List;

public interface BasicService<T> {

    List<T> getall();
    List<T> search(String... searchString);

    T get(long id);

    T save(T obj);

    void delete(T object);

}
