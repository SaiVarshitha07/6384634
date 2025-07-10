package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AssertionsTest {

    // Exercise 3: Assertions in JUnit
    @Test
    public void testAssertions() {
        assertEquals("Sum should be 5", 5, 2 + 3);

        assertTrue("5 is greater than 3", 5 > 3);

        assertFalse("3 is not greater than 5", 3 > 5);

        String str = null;
        assertNull("String should be null", str);

        String name = "ABC";
        assertNotNull("Name should not be null", name);
    }
}