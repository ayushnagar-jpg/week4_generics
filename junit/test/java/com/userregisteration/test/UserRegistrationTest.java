package com.userregisteration.test;
import com.userregisteration.UserRegistration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    // ✅ Test successful registration
    @Test
    void testValidUserRegistration() {
        assertEquals("User registered successfully!", 
                     UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password1"));
    }

    // ❌ Test empty username
    @Test
    void testEmptyUsername() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("", "john.doe@example.com", "Password1");
        });
        assertEquals("Username cannot be empty.", exception.getMessage());
    }

    // ❌ Test invalid email format
    @Test
    void testInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "invalid-email", "Password1");
        });
        assertEquals("Invalid email format.", exception.getMessage());
    }

    // ❌ Test weak password (missing digit)
    @Test
    void testWeakPasswordMissingDigit() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Password");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }

    // ❌ Test weak password (too short)
    @Test
    void testWeakPasswordTooShort() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserRegistration.registerUser("JohnDoe", "john.doe@example.com", "Pass1");
        });
        assertEquals("Password must be at least 8 characters long, contain one uppercase letter, and one digit.", exception.getMessage());
    }
}
