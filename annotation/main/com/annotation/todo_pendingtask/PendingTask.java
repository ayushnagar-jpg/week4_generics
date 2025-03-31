package annotation.todo_pendingtask;


public class PendingTask {

    @Todo(task = "Implement user login", assignedTo = "Alice", priority = "HIGH")
    public void userLogin() {
        System.out.println("User login functionality.");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeQueries() {
        System.out.println("Database query optimization.");
    }

    @Todo(task = "Add unit tests for data processing", assignedTo = "Charlie", priority = "LOW")
    public void addUnitTests() {
        System.out.println("Adding unit tests for data processing.");
    }

    public void completedFeature() {
        System.out.println("This feature is complete.");
    }
}
