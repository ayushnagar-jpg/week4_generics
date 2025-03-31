package annotation.logging_method;
public class Main {

    public static void main(String[] args) {
        SampleTasks tasks = new SampleTasks();

        // Execute and log execution time for annotated methods
        ExecutionTimeLogger.logExecutionTime(tasks, "fastMethod");
        ExecutionTimeLogger.logExecutionTime(tasks, "slowMethod");
        ExecutionTimeLogger.logExecutionTime(tasks, "noLogMethod");
    }
}

