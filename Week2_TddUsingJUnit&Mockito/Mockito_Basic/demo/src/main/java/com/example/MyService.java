package com.example;

// Exercise 1: Mocking and Stubbing
public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

    // Exercise 2: Verifying Interactions
    // Creating a method with  arguments to verify the interaction
    public void processAndSend(String input) {
        api.sendData(input);
    }
}