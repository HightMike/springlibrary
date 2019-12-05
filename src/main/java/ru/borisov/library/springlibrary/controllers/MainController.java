package ru.borisov.library.springlibrary.controllers;


import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.borisov.library.springlibrary.entities.Author;
import ru.borisov.library.springlibrary.entities.Book;
import ru.borisov.library.springlibrary.services.AuthorService;
import ru.borisov.library.springlibrary.services.BookService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

@Controller
@Log
public class MainController {

    @Autowired
    private AuthorService authorService;

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String baseUrlRedirect(HttpServletRequest request, HttpServletResponse httpServletResponse) {


        //Page<Author> authorPage = authorService.getPageList("д", PageRequest.of(0,10, Sort.Direction.ASC, "fio"));

//        Page<Book> bookPage = bookService.geBookListWK(PageRequest.of(0,10, Sort.Direction.ASC, "name"));

//        Page<Book> bookPage = bookService.getBookRepository().findByGenre(15,PageRequest.of(0,10, Sort.Direction.ASC, "name"));
//        return "ok";

        Page<Author> authorPage = authorService.getPageList("д", PageRequest.of(0,10, Sort.Direction.ASC, "fio"));

        Author author = new Author();
        author.setFio("Сорокин Тестовый1");
        author.setBirthday(new Date(1996L));

        Author checkAuthor = authorService.save(author);

        return  "ok";

    }

}
