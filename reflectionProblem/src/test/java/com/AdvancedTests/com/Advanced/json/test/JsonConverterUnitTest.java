package com.AdvancedTests.com.Advanced.json.test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.Advanced.customobjectmapper.Person;
import com.Advanced.json.JsonConverter;

public class JsonConverterUnitTest {

    @Test
    public void testToJson() {
        // Create a sample object
        Person person = new Person("Bob", 30, false);

        // Convert to JSON
        String json = JsonConverter.toJson(person);

        // Expected JSON output
        String expectedJson = "{\"name\": \"Bob\", \"age\": 30, \"isStudent\": false}";

        // Assert that the generated JSON matches the expected format
        assertEquals(expectedJson, json);
    }
}
