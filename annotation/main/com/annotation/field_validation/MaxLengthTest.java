package annotation.field_validation;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaxLengthTest {

    @Test
    public void testValidUsername() {
        User user = new User("JohnDoe");
        assertEquals("JohnDoe", user.getUsername(), "Username should be set correctly");
    }

    @Test
    public void testMaxLengthExceeded() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("ThisUsernameIsTooLong");
        }, "Should throw IllegalArgumentException when length exceeds max limit");
    }

    @Test
    public void testEmptyUsername() {
        User user = new User("");
        assertEquals("", user.getUsername(), "Empty username should be accepted");
    }

    @Test
    public void testNullUsername() {
        User user = new User(null);
        assertEquals(null, user.getUsername(), "Null username should be accepted");
    }
}
