package annotation.todo_pendingtask;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class TodoAnnotationTest {

    @Test
    public void testAnnotationPresence() {
        try {
            // Get the methods from the PendingTasks class
            Method loginMethod = PendingTask.class.getMethod("userLogin");
            Method optimizeMethod = PendingTask.class.getMethod("optimizeQueries");
            Method testMethod = PendingTask.class.getMethod("addUnitTests");
            Method completedMethod = PendingTask.class.getMethod("completedFeature");

            // Check if the annotation is present
            assertTrue(loginMethod.isAnnotationPresent(Todo.class), 
                "userLogin should be annotated with @Todo");
            assertTrue(optimizeMethod.isAnnotationPresent(Todo.class), 
                "optimizeQueries should be annotated with @Todo");
            assertTrue(testMethod.isAnnotationPresent(Todo.class), 
                "addUnitTests should be annotated with @Todo");

            // Check that the completed feature method is not annotated
            boolean isCompletedAnnotated = completedMethod.isAnnotationPresent(Todo.class);
            assertEquals(false, isCompletedAnnotated, 
                "completedFeature should not be annotated with @Todo");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }

    @Test
    public void testAnnotationValues() {
        try {
            // Get the methods from the PendingTasks class
            Method loginMethod = PendingTask.class.getMethod("userLogin");
            Method optimizeMethod = PendingTask.class.getMethod("optimizeQueries");
            Method testMethod = PendingTask.class.getMethod("addUnitTests");

            // Retrieve the annotation instances
            Todo loginTodo = loginMethod.getAnnotation(Todo.class);
            Todo optimizeTodo = optimizeMethod.getAnnotation(Todo.class);
            Todo testTodo = testMethod.getAnnotation(Todo.class);

            // Validate the annotation values for userLogin
            assertEquals("Implement user login", loginTodo.task(), 
                "Task description should match for userLogin");
            assertEquals("Alice", loginTodo.assignedTo(), 
                "Assigned person should be Alice for userLogin");
            assertEquals("HIGH", loginTodo.priority(), 
                "Priority should be HIGH for userLogin");

            // Validate the annotation values for optimizeQueries
            assertEquals("Optimize database queries", optimizeTodo.task(), 
                "Task description should match for optimizeQueries");
            assertEquals("Bob", optimizeTodo.assignedTo(), 
                "Assigned person should be Bob for optimizeQueries");
            assertEquals("MEDIUM", optimizeTodo.priority(), 
                "Priority should be MEDIUM (default) for optimizeQueries");

            // Validate the annotation values for addUnitTests
            assertEquals("Add unit tests for data processing", testTodo.task(), 
                "Task description should match for addUnitTests");
            assertEquals("Charlie", testTodo.assignedTo(), 
                "Assigned person should be Charlie for addUnitTests");
            assertEquals("LOW", testTodo.priority(), 
                "Priority should be LOW for addUnitTests");

        } catch (NoSuchMethodException e) {
            throw new AssertionError("Method not found", e);
        }
    }
}
