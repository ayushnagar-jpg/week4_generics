package com.exceptionhandling.test;
import org.junit.jupiter.api.Test;
import com.exceptionhandling.ExceptionHandling;
import static org.junit.jupiter.api.Assertions.*;


class ExceptionHandlingTest {
    private final ExceptionHandling exceptionHandling = new ExceptionHandling();

    // Test for division by zero exception
    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            exceptionHandling.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message should match");
    }

    //  Test a valid division
    @Test
    void testValidDivision() {
        assertEquals(5, exceptionHandling.divide(10, 2), "10 / 2 should be 5");
    }
}
