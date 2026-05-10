package com.bookstore.bookstore_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    // CREATE
    public Book createBook(Book book) {
        return repo.save(book);
    }

    // READ ALL
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    // READ BY ID
    public Book getBookById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
    }

    // UPDATE
    public Book updateBook(Long id, Book newBook) {
        Book existingBook = getBookById(id);

        existingBook.setTitle(newBook.getTitle());
        existingBook.setAuthor(newBook.getAuthor());

        return repo.save(existingBook);
    }

    // DELETE
    public void deleteBook(Long id) {
        repo.deleteById(id);
    }
}