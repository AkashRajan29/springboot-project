package com.example.library.service;

import com.example.library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();
    private final AtomicLong sequence = new AtomicLong(1);

    public List<Book> findAll() { return new ArrayList<>(books); }
    public Book findById(Long id) {
        return books.stream().filter(b -> b.getBookId().equals(id)).findFirst()
                .orElseThrow(() -> new BookNotFoundException("Book not found: " + id));
    }
    public Book add(Book book) {
        book.setBookId(sequence.getAndIncrement());
        books.add(book);
        return book;
    }
    public Book update(Long id, Book input) {
        Book book = findById(id);
        book.setBookName(input.getBookName());
        book.setAuthor(input.getAuthor());
        book.setPrice(input.getPrice());
        book.setAvailable(input.isAvailable());
        return book;
    }
    public Book updateAvailability(Long id, boolean available) {
        Book book = findById(id);
        book.setAvailable(available);
        return book;
    }
    public void delete(Long id) { books.remove(findById(id)); }
}
