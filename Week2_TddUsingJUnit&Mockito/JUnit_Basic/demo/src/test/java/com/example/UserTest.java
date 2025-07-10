package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class UserTest {
    // Using @Before and @After annotations for setup and teardown methods
    private User user;

    @Before
    public void setUp() {
        // Arrange
        user = new User("ABC");
        System.out.println("Setup done");
    }

    @After
    public void tearDown() {
        user = null;
        System.out.println("Teardown done");
    }

    @Test
    public void testUserIsInitiallyInactive() {
        boolean status = user.isActive();
        assertFalse(status);
    }

    @Test
    public void testActivateUser(){
        user.activate();
        assertTrue(user.isActive());
    }

    @Test
    public void testDeactivateUser() {
        user.activate();
        user.deactivate();
        assertFalse(user.isActive());
    }

    @Test
    public void testUserName() {
        String name = user.getName();
        assertEquals("ABC", name);
    }
}