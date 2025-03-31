package com.Advanced.customobjectmapper;
import java.util.HashMap;
import java.util.Map;

public class ObjectMapperTest {
    public static void main(String[] args) {
        // Create a map of properties
        Map<String, Object> properties = new HashMap<>();
        properties.put("name", "John Doe");
        properties.put("age", 25);
        properties.put("city", "New York");
        properties.put("extraField", "Ignored Field"); // This field does not exist in Person class

        // Convert map to Person object
        Person person = ObjectMapper.toObject(Person.class, properties);

        // Display the populated object
        person.display();
    }
}
