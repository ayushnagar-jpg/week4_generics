package com.Advanced.json;
public class JsonConverterTest {
    public static void main(String[] args) {
        // ✅ Create a sample Person object
        Person person = new Person("Alice", 25, true);

        // ✅ Convert the object to a JSON-like string
        String json = JsonConverter.toJson(person);

        // ✅ Expected JSON Output
        String expectedJson = "{\"name\": \"Alice\", \"age\": 25, \"isStudent\": true}";

        // ✅ Print results
        System.out.println("Generated JSON: " + json);
        System.out.println("Expected JSON:  " + expectedJson);

        // ✅ Validate Output
        if (json.equals(expectedJson)) {
            System.out.println("✅ Test Passed!");
        } else {
            System.out.println("❌ Test Failed! Mismatch in JSON output.");
        }
    }
}
