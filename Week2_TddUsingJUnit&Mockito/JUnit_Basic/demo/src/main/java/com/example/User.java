package com.example;

public class User {
    private String name;
    private boolean active;

    public User(String name) {
        this.name = name;
        this.active = false;
    }

    public void activate() {
        active = true;
    }

    public void deactivate() {
        active = false;
    }

    public boolean isActive() {
        return active;
    }

    public String getName() {
        return name;
    }
}