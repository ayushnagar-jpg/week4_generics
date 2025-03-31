package annotation.field_validation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MaxLengthTest {

    @Test
    public void testValidUsername() {
        User user = new User("JohnDoe");
        assertEquals("JohnDoe", user.getUsername(), "Username should be set correctly");
    }

    @Test
    public void testMaxLengthExceeded() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new User("ThisUsernameIsTooLong");
        });
        assertTrue(exception.getMessage().contains("exceeds maximum length of 10"));
    }

    @Test
    public void testBoundaryLengthUsername() {
        User user = new User("ABCDEFGHIJ"); // Exactly 10 characters
        assertEquals("ABCDEFGHIJ", user.getUsername(), "Username with max length should be accepted");
    }

    @Test
    public void testEmptyUsername() {
        User user = new User("");
        assertEquals("", user.getUsername(), "Empty username should be accepted");
    }

    @Test
    public void testNullUsername() {
        User user = new User(null);
        assertNull(user.getUsername(), "Null username should be accepted");
    }
}

