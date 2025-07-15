package com.library.service;

import com.library.repository.BookRepository;

// Exercise 2: Implementing Dependency Injection
// Refer 2_ImplementingDependencyInjection Folder for the Output
public class BookService {
    private BookRepository bookRepository;
    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Exercise 1: Configuring a Basic Spring Application
    public void addBook() {
        System.out.println("BookService: Adding book...");
        bookRepository.saveBook();
    }
}