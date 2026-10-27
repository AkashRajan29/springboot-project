package com.example.library.service;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) { super(message); }
}
