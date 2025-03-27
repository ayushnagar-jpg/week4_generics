package com.passwordstrengthvalidator.test;
import org.junit.jupiter.api.Test;
import com.passwordstrengthvalidator.PasswordValidator;
import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    // ✅ Test for a strong password
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Secure123"), "Password should be valid");
    }

    // ❌ Test for a password that is too short
    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Ab1"), "Password is too short");
    }

    // ❌ Test for a password missing an uppercase letter
    @Test
    void testMissingUppercase() {
        assertFalse(PasswordValidator.isValid("secure123"), "Password must contain an uppercase letter");
    }

    // ❌ Test for a password missing a digit
    @Test
    void testMissingDigit() {
        assertFalse(PasswordValidator.isValid("SecurePass"), "Password must contain a digit");
    }

    // ❌ Test for a null password
    @Test
    void testNullPassword() {
        assertFalse(PasswordValidator.isValid(null), "Null password should be invalid");
    }

    // ❌ Test for an empty password
    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""), "Empty password should be invalid");
    }
}
