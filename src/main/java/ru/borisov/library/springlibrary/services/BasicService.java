package ru.borisov.library.springlibrary.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface BasicService<T> {

    List<T> getall();
    List<T> search(String... searchString);

    T get(long id);

    T save(T obj);

    void delete(T object);


    //получение записей с сортировкой результата
    List<T> getAll(Sort sort);

    Page<T> getAll (int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection);

    Page<T> search (int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString);

}
