package com.Advanced.customobjectmapper;
import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            // Create a new instance of the given class
            T instance = clazz.getDeclaredConstructor().newInstance();

            // Iterate over map entries
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    // Get the field by name
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true); // Allow modification if private

                    // Set the field value
                    field.set(instance, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Warning: Field '" + fieldName + "' does not exist in " + clazz.getSimpleName());
                }
            }
            return instance;
        } catch (Exception e) {
            throw new RuntimeException("Error creating object", e);
        }
    }
}
