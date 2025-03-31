package annotation.json_field;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// JUnit Test Class
public class JsonSerializerTest {

    @Test
    public void testNormalValues() throws IllegalAccessException {
        User user = new User("Alice", 25);
        String expected = "{\"User_name\":\"Alice\", \"User_age\":\"25\"}";
        assertEquals(expected, JsonSerializer.serialize(user));
    }

    @Test
    public void testEmptyName() throws IllegalAccessException {
        User user = new User("", 18);
        String expected = "{\"User_name\":\"\", \"User_age\":\"18\"}";
        assertEquals(expected, JsonSerializer.serialize(user));
    }

    @Test
    public void testZeroAge() throws IllegalAccessException {
        User user = new User("Bob", 0);
        String expected = "{\"User_name\":\"Bob\", \"User_age\":\"0\"}";
        assertEquals(expected, JsonSerializer.serialize(user));
    }

    @Test
    public void testNullName() throws IllegalAccessException {
        User user = new User(null, 22);
        String expected = "{\"User_name\":null, \"User_age\":\"22\"}";
        assertEquals(expected, JsonSerializer.serialize(user));
    }
}
