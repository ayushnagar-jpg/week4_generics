package com.bl.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.bl.Calculator;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10, calculator.add(5, 5));
        assertEquals(0, calculator.add(-5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-10, calculator.subtract(-5, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2, calculator.divide(10, 5));
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }
}
