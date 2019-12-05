package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.borisov.library.springlibrary.entities.Author;
import ru.borisov.library.springlibrary.entities.Book;
import ru.borisov.library.springlibrary.entities.Genre;
import ru.borisov.library.springlibrary.repositories.AuthorRepository;
import ru.borisov.library.springlibrary.repositories.BookRepository;

import java.util.List;

@Service
public class BookService implements BasicService<Book> {

    private BookRepository bookRepository;

    public BookService() {
        super();
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }

    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public List<Book> getall() {
        return bookRepository.findAll();
    }
    @Override
    public Book get(long id){
        return bookRepository.getOne(id);
    }

    @Override
    public Book save(Book obj) {
        return null;
    }

    @Override
    public void delete(Book object) {

    }

    public List<Book> getBookByNOrA(String name, String fio) {
        return bookRepository.findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName(name, fio);
    }

    public List<Book> search (String... searchString) {
        return bookRepository.findAll();
    }

    public Page<Book> geBookListWK(Pageable pageable) {
        return bookRepository.findAllWithoutContent(pageable);
    }

    List<Book> findTopBooks (int limit) {
        return null;
    }

    @Override
    public List<Book> getAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Book> getAll(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection) {
        return null;
    }

    @Override
    public Page<Book> search(int pageNumber, int pageSize, String sortField, Sort.Direction sortDirection, String... searchString) {
        return null;
    }

}
