package ru.borisov.library.springlibrary.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.borisov.library.springlibrary.entities.Book;
import ru.borisov.library.springlibrary.entities.Genre;

import java.util.List;

@Repository

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByNameContainingIgnoreCaseOrAuthorFioContainingIgnoreCaseOrderByName(String name, String fio);

    @Query("select new ru.borisov.library.springlibrary.entities.Book(b.id,b.name, b.pageCount, b.isbn, b.genre, b.author, b.publisher, b.publishYear, b.image, b.descr,b.viewCount,b.totalRating, b.totalVoteCount,b.avgRating) from Book b")
    Page<Book> findAllWithoutContent (Pageable pageable); // возвращает книги с постраничностью без pdf контента

    @Modifying(clearAutomatically = true) // такая аннотация нужна если мы обновляем данные
    @Query("update Book b set b.content=:content where b.id=:id")
    void updateContent(@Param("content")byte[] content,@Param("id") long id);


    @Query("select new ru.borisov.library.springlibrary.entities.Book(b.id,b.image) from Book b")
    List<Book> findTopBooks(Pageable pageable);

    List<Book> findBookById(Long id);

    // если стоит прямой запрос Query, то название метода уже роли не играет
    // Param - для надежности ..
    @Query("select new ru.borisov.library.springlibrary.entities.Book(b.id,b.name, b.pageCount, b.isbn, b.genre, b.author, b.publisher, b.publishYear, b.image, b.descr,b.viewCount,b.totalRating, b.totalVoteCount,b.avgRating) from Book b where b.genre.id=:genreId")
    Page<Book> findByGenre(@Param("genreId") long genreId, Pageable pageable);
}
