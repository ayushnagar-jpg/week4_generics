package com.userregisteration;
import java.util.regex.Pattern;

public class UserRegistration {

    // Email validation regex
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
    // Password validation regex: At least 8 characters, 1 uppercase letter, 1 digit
    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    // ✅ Register user with validation
    public static String registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        }
        
        if (email == null || !Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format.");
        }
        
        if (password == null || !Pattern.matches(PASSWORD_REGEX, password)) {
            throw new IllegalArgumentException("Password must be at least 8 characters long, contain one uppercase letter, and one digit.");
        }

        return "User registered successfully!";
    }
}
