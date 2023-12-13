package by.itstep.demo.repository;

import by.itstep.demo.module.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BookRepository {
    private List<Book> bookList;


    public BookRepository() {
        bookList = new ArrayList<>();
        bookList.add(new Book(0L,12, "Victory"));
        bookList.add(new Book(1L,10, "Health"));
        bookList.add(new Book(2L,15, "Kill"));
    }

    public List<Book> findAll() {
        return bookList;
    }

    public Optional<Book> findById(Long id) {
        return bookList.stream().filter(book -> book.getId() == id).findFirst();

    }

}
