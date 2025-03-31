package com.Advanced.methodexecutiontiming;
import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void measureExecutionTime(Object obj, String methodName, Object... args) {
        try {
            Class<?> clazz = obj.getClass();

            // Find the method based on name and parameters
            Method method;
            if (args.length == 0) {
                method = clazz.getMethod(methodName);
            } else {
                Class<?>[] paramTypes = new Class<?>[args.length];
                for (int i = 0; i < args.length; i++) {
                    paramTypes[i] = args[i].getClass();
                }
                method = clazz.getMethod(methodName, paramTypes);
            }

            // Measure execution time
            long startTime = System.nanoTime();
            Object result = method.invoke(obj, args);
            long endTime = System.nanoTime();

            // Print result and execution time
            System.out.println("Method: " + methodName + " executed in " + (endTime - startTime) / 1_000_000.0 + " ms");
            if (result != null) {
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SampleOperations sample = new SampleOperations();

        // Measure execution time of different methods
        measureExecutionTime(sample, "fastMethod");
        measureExecutionTime(sample, "slowMethod");
        measureExecutionTime(sample, "computeSum", 10, 20);
    }
}
