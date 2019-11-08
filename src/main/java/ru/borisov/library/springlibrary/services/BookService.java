package ru.borisov.library.springlibrary.services;

import org.springframework.beans.factory.annotation.Autowired;
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
        return bookRepository.getOne(String.valueOf(id));
    }

    @Override
    public Book save(Book obj) {
        return bookRepository.
    }

    @Override
    public void delete(Book object) {
        return bookRepository.delete(object);

    }

    List<Book> search (String... searchString) {
        return bookRepository.findAll();
    }


    List<Book> findTopBooks (int limit) {
        return bookRepository.
    }

}