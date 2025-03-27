package com.dateformatter.test;
import com.dateformatter.DateFormatter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    // ✅ Test valid date conversion
    @Test
    void testValidDateFormat() {
        assertEquals("25-03-2025", DateFormatter.formatDate("2025-03-25"));
        assertEquals("01-01-2000", DateFormatter.formatDate("2000-01-01"));
    }

    // ❌ Test invalid date formats
    @Test
    void testInvalidDateFormat() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("25-03-2025");  // Incorrect format (dd-MM-yyyy instead of yyyy-MM-dd)
        });

        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }

    @Test
    void testNonDateString() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            DateFormatter.formatDate("invalid-date"); // Non-date string
        });

        assertEquals("Invalid date format. Expected yyyy-MM-dd.", exception.getMessage());
    }
}
