package com.Advanced.json;
import java.lang.reflect.Field;


public class JsonConverter {
    
    public static String toJson(Object obj) {
        if (obj == null) return "null";

        StringBuilder json = new StringBuilder("{");
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        int fieldCount = 0;

        for (Field field : fields) {
            field.setAccessible(true); // Make private fields accessible
            
            try {
                Object value = field.get(obj);
                if (fieldCount > 0) json.append(", "); // Add comma for proper JSON formatting
                
                json.append("\"").append(field.getName()).append("\": ");
                json.append(formatValue(value));
                
                fieldCount++;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + field.getName(), e);
            }
        }
        json.append("}");
        return json.toString();
    }

    private static String formatValue(Object value) {
        if (value instanceof String) {
            return "\"" + value + "\""; // Strings should be enclosed in double quotes
        } else if (value instanceof Number || value instanceof Boolean) {
            return value.toString(); // Directly return numbers and booleans
        } else if (value == null) {
            return "null"; // Explicitly return "null" for null values
        } else {
            return toJson(value); // Recursively convert nested objects
        }
    }
}
