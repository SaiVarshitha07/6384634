package com.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {
        logger.info("Application started");

        int age = 16;
        if (age < 18) {
            logger.warning("Warning: Underage user detected!");
        }

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error: Division by zero", e);
        }
    }
}