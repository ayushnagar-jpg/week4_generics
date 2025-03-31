package annotation.logging_method;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {

    public static void logExecutionTime(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();

                // Invoke the method
                method.invoke(obj);

                long endTime = System.nanoTime();
                long duration = endTime - startTime;

                System.out.println("Execution time of " + methodName + ": " + duration + " ns");
            } else {
                System.out.println("Method " + methodName + " is not annotated with @LogExecutionTime.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

