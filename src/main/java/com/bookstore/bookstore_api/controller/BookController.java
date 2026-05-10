package com.bookstore.bookstore_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.service.BookService;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

@PostMapping
public Book create(@Valid @RequestBody Book book) {
    return service.createBook(book);
}

@GetMapping
public List<Book> getAll() {
    return service.getAllBooks();
}

@GetMapping("/{id}")
public Book getById(@PathVariable Long id) {
    return service.getBookById(id);
}

@PutMapping("/{id}")
public Book update(@PathVariable Long id, @RequestBody Book book) {
    return service.updateBook(id, book);
}

@DeleteMapping("/{id}")
public String delete(@PathVariable Long id) {
    service.deleteBook(id);
    return "Deleted successfully";
}
}