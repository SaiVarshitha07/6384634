package com.example;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    // Exercise 2: Writing Basic JUnit Tests
    //  Writing JUnit Tests for testAdd() and testSubtract()
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(7, 3));
    }
}