package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Exercise 1
        // Configuring a Basic Spring Application
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook();
    }
}