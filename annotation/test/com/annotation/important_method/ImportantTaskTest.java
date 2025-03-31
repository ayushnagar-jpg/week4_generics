package annotation.important_method;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ImportantTaskTest {

    @Test
    public void testAnnotationPresence() {
        try {
            // Get the methods from the ImportantTask class
            Method criticalMethod = ImportantTask.class.getMethod("criticalOperation");
            Method secondaryMethod = ImportantTask.class.getMethod("secondaryOperation");
            Method regularMethod = ImportantTask.class.getMethod("regularOperation");

            // Check if the annotation is present
            assertTrue(criticalMethod.isAnnotationPresent(ImportantMethod.class), 
                "criticalOperation should be annotated with @ImportantMethod");
            assertTrue(secondaryMethod.isAnnotationPresent(ImportantMethod.class), 
                "secondaryOperation should be annotated with @ImportantMethod");

            // Check that the regular method is not annotated
            boolean isRegularAnnotated = regularMethod.isAnnotationPresent(ImportantMethod.class);
            assertEquals(false, isRegularAnnotated, 
                "regularOperation should not be annotated with @ImportantMethod");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }

    @Test
    public void testAnnotationValues() {
        try {
            // Get the methods from the ImportantTask class
            Method criticalMethod = ImportantTask.class.getMethod("criticalOperation");
            Method secondaryMethod = ImportantTask.class.getMethod("secondaryOperation");

            // Retrieve the annotation instances
            ImportantMethod criticalAnnotation = criticalMethod.getAnnotation(ImportantMethod.class);
            ImportantMethod secondaryAnnotation = secondaryMethod.getAnnotation(ImportantMethod.class);

            // Validate the level values
            assertEquals("HIGH", criticalAnnotation.level(), 
                "The criticalOperation method should have level HIGH");
            assertEquals("MEDIUM", secondaryAnnotation.level(), 
                "The secondaryOperation method should have level MEDIUM");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }
}
