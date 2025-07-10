package com.library.service;

import com.library.repository.BookRepository;

// Exercise 2 Implementation 
// Implementing Dependency Injection
public class BookService {
    private BookRepository bookRepository;
    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Exercise 1 Implementation
    // Configuring a Basic Spring Application
    public void addBook() {
        System.out.println("BookService: Adding book...");
        bookRepository.saveBook();
    }
}