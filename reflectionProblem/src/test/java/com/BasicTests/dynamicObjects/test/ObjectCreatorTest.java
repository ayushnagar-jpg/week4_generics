package com.BasicTests.dynamicObjects.test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Constructor;
import org.junit.Test;

import com.Basic.dynamicObjects.Student;

public class ObjectCreatorTest {

    @Test
    public void testDefaultConstructorInstance() {
        try {
            // Get class object
            Class<?> clazz = Student.class;

            // Create an instance dynamically using newInstance()
            Student student = (Student) clazz.getDeclaredConstructor().newInstance();

            // Verify default values
            assertEquals("Default Name", student.getName());
            assertEquals(18, student.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testParameterizedConstructorInstance() {
        try {
            // Get class object
            Class<?> clazz = Student.class;

            // Get parameterized constructor
            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);

            // Create an instance dynamically
            Student student = (Student) constructor.newInstance("Alice", 20);

            // Verify assigned values
            assertEquals("Alice", student.getName());
            assertEquals(20, student.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
