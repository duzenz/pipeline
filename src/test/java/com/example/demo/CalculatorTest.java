package com.example.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void sum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}