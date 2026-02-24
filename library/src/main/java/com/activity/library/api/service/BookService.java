package com.activity.library.api.service;

import com.activity.library.api.entity.Book;
import com.activity.library.api.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository repository;

    public Book create(Book book) {
        return repository.save(book);
    }

    public Optional<Book> findById(String id) {
        return repository.findById(id);
    }

    public List<Book> findAll() {
        return repository.findAll();
    }

    public Book update(String id, Book updatedBook) {
        updatedBook.setId(id);
        return updatedBook;
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
