package com.passwordstrengthvalidator;

public class PasswordValidator {

    // ✅ Method to check if a password is strong
    public static boolean isValid(String password) {
        if (password == null || password.length() < 8) {
            return false; // Must be at least 8 characters long
        }
        if (!password.matches(".*[A-Z].*")) {
            return false; // Must contain at least one uppercase letter
        }
        if (!password.matches(".*\\d.*")) {
            return false; // Must contain at least one digit
        }
        return true;
    }
}
