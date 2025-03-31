package com.Basic.accessprivatefield;
import java.lang.reflect.Field;

public class PrivateFieldAccess {
    public static void main(String[] args) {
        try {
            // Create an instance of Person
            Person person = new Person(25);

            // Get the class object
            Class<?> clazz = person.getClass();

            // Access the private field "age"
            Field ageField = clazz.getDeclaredField("age");
            ageField.setAccessible(true); // Allow modification

            // Get the current value of "age"
            int currentAge = (int) ageField.get(person);
            System.out.println("Original Age: " + currentAge);

            // Modify the private field "age"
            ageField.set(person, 30);

            // Get the updated value
            int updatedAge = (int) ageField.get(person);
            System.out.println("Updated Age: " + updatedAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
