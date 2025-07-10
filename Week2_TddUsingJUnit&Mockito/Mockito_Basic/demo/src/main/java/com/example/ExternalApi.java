package com.example;

// Exercise 1: Mocking and Stubbing
public interface ExternalApi {
    String getData();

    // Exercise 2: Verifying Interactions
    void sendData(String payload);
}