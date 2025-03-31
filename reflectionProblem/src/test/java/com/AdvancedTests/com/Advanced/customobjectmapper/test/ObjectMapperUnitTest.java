package com.AdvancedTests.com.Advanced.customobjectmapper.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

import com.Advanced.customobjectmapper.ObjectMapper;
import com.Advanced.customobjectmapper.Person;

public class ObjectMapperUnitTest {

    @Test
    public void testToObject() {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Alice");
        properties.put("age", 30);
        properties.put("city", "San Francisco");

        // Convert map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Verify that fields are set correctly
        assertEquals("Alice", person.getName());
        assertEquals(30, person.getAge());
        assertEquals("San Francisco", person.getCity());
    }

    @Test
    public void testMissingFields() {
        // Create a map with missing fields
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "Bob");

        // Convert map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Verify fields (age & city should remain default)
        assertEquals("Bob", person.getName());
        assertEquals(0, person.getAge()); // Default int value
        assertNull(person.getCity()); // Default value for uninitialized String
    }
}
