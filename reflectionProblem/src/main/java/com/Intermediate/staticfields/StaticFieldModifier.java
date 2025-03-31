package com.Intermediate.staticfields;
import java.lang.reflect.Field;

public class StaticFieldModifier {
    public static void main(String[] args) {
        try {
            // Get the class object
            Class<?> clazz = Configuration.class;

            // Access the private static field "API_KEY"
            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true); // Allow modification

            // Modify the static field value
            field.set(null, "NEW_API_KEY");

            // Print the modified value
            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
