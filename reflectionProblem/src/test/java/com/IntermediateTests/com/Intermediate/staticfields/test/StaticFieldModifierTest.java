package com.IntermediateTests.com.Intermediate.staticfields.test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Field;
import org.junit.Test;

import com.Intermediate.staticfields.Configuration;

public class StaticFieldModifierTest {

    @Test
    public void testModifyStaticApiKey() {
        try {
            // Get the class object
            Class<?> clazz = Configuration.class;

            // Access the private static field "API_KEY"
            Field field = clazz.getDeclaredField("API_KEY");
            field.setAccessible(true); // Allow modification

            // Modify the static field value
            field.set(null, "TEST_API_KEY");

            // Verify the new value
            assertEquals("TEST_API_KEY", Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
