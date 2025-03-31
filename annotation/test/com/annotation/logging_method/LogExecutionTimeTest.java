package annotation.logging_method;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LogExecutionTimeTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Redirect the standard output to capture console prints
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testAnnotationPresence() {
        try {
            // Get methods from the SampleTasks class
            Method fastMethod = SampleTasks.class.getMethod("fastMethod");
            Method slowMethod = SampleTasks.class.getMethod("slowMethod");
            Method noLogMethod = SampleTasks.class.getMethod("noLogMethod");

            // Check if the methods are annotated with @LogExecutionTime
            assertTrue(fastMethod.isAnnotationPresent(LogExecutionTime.class), 
                "fastMethod should be annotated with @LogExecutionTime");
            assertTrue(slowMethod.isAnnotationPresent(LogExecutionTime.class), 
                "slowMethod should be annotated with @LogExecutionTime");

            // Check if noLogMethod is not annotated
            assertFalse(noLogMethod.isAnnotationPresent(LogExecutionTime.class), 
                "noLogMethod should not be annotated with @LogExecutionTime");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }

    @Test
    public void testExecutionTimeLogging() {
        SampleTasks tasks = new SampleTasks();

        // Invoke the methods using the ExecutionTimeLogger
        ExecutionTimeLogger.logExecutionTime(tasks, "fastMethod");
        String fastOutput = outputStream.toString();
        assertTrue(fastOutput.contains("Execution time of fastMethod:"), 
            "Console output should contain execution time for fastMethod");

        outputStream.reset();

        ExecutionTimeLogger.logExecutionTime(tasks, "slowMethod");
        String slowOutput = outputStream.toString();
        assertTrue(slowOutput.contains("Execution time of slowMethod:"), 
            "Console output should contain execution time for slowMethod");

        outputStream.reset();

        ExecutionTimeLogger.logExecutionTime(tasks, "noLogMethod");
        String noLogOutput = outputStream.toString();
        assertTrue(noLogOutput.contains("is not annotated with @LogExecutionTime."), 
            "Console output should indicate no annotation for noLogMethod");

        // Restore the original System.out
        System.setOut(originalOut);
    }
}
