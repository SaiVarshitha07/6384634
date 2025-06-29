package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest{

    @Test
    public void testAddition() {
        int expected = 5;
        int actual = 2 + 3;
        assertEquals(expected, actual);
    }
}