package com.Basic.reflectionProblem.com.getclass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
    // Method to fetch class details using reflection
    public static String getClassInfo(String className) {
        StringBuilder result = new StringBuilder();

        try {
            // Load the class dynamically
            Class<?> clazz = Class.forName(className);

            // Append class name
            result.append("Class Name: ").append(clazz.getName()).append("\n\n");

            // Append Constructors
            result.append("Constructors:\n");
            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                result.append("  ").append(constructor).append("\n");
            }

            // Append Fields
            result.append("\nFields:\n");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                result.append("  ").append(field).append("\n");
            }

            // Append Methods
            result.append("\nMethods:\n");
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                result.append("  ").append(method).append("\n");
            }

        } catch (ClassNotFoundException e) {
            return "Class not found! Please check the name and try again.";
        }

        return result.toString();
    }
}
