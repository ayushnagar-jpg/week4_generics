package com.BasicTests.accessprivatefield.test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Field;
import org.junit.Test;

import com.Basic.accessprivatefield.Person;

public class PrivateFieldAccessTest {

    @Test
    public void testModifyPrivateAgeField() {
        try {
            // Create a Person object with initial age 25
            Person person = new Person(25);

            // Get the private field "age"
            Field ageField = Person.class.getDeclaredField("age");
            ageField.setAccessible(true); // Enable access

            // Modify the age value
            ageField.set(person, 40);

            // Retrieve the updated value and verify
            int updatedAge = (int) ageField.get(person);
            assertEquals(40, updatedAge);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
