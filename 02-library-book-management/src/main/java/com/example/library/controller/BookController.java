package com.example.library.controller;

import com.example.library.model.Book;
import com.example.library.service.BookNotFoundException;
import com.example.library.service.BookService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService service;
    public BookController(BookService service) { this.service = service; }

    @GetMapping
    public List<Book> getAll() { return service.findAll(); }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) { return service.findById(id); }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book add(@Valid @RequestBody Book book) { return service.add(book); }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @Valid @RequestBody Book book) {
        return service.update(id, book);
    }

    @PatchMapping("/{id}/availability")
    public Book availability(@PathVariable Long id, @RequestParam boolean available) {
        return service.updateAvailability(id, available);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) { service.delete(id); }

    @ExceptionHandler(BookNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> notFound(BookNotFoundException ex) {
        return Map.of("error", ex.getMessage());
    }
}
