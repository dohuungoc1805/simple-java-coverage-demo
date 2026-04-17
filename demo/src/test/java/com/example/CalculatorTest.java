package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testNKhongDuong() {
        Calculator calc = new Calculator();
        assertEquals(0, calc.sumEvenNumbers(0));
        assertEquals(0, calc.sumEvenNumbers(-5));
    }

    @Test
    void testNDuong() {
        Calculator calc = new Calculator();
        assertEquals(30, calc.sumEvenNumbers(10));
        assertEquals(0, calc.sumEvenNumbers(1));
        assertEquals(2, calc.sumEvenNumbers(2));
    }
}