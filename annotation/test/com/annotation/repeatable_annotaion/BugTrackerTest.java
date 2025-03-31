package annotation.repeatable_annotaion;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class BugTrackerTest {

    @Test
    public void testAnnotationPresence() {
        try {
            // Get the method from the BugTracker class
            Method method = BugTracker.class.getMethod("buggyMethod");

            // Check for the presence of the container annotation
            assertTrue(method.isAnnotationPresent(BugReports.class), 
                "buggyMethod should be annotated with @BugReport");
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }

    @Test
    public void testAnnotationValues() {
        try {
            // Get the method from the BugTracker class
            Method method = BugTracker.class.getMethod("buggyMethod");

            // Retrieve the container annotation (BugReports)
            BugReports bugReports = method.getAnnotation(BugReports.class);

            // Check the number of bug reports
            assertEquals(2, bugReports.value().length, 
                "There should be exactly 2 bug reports");

            // Check the content of each bug report
            assertEquals("NullPointerException when input is null", 
                bugReports.value()[0].description(), 
                "First bug description should be correct");

            assertEquals("ArrayIndexOutOfBounds when index is negative", 
                bugReports.value()[1].description(), 
                "Second bug description should be correct");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }
}
