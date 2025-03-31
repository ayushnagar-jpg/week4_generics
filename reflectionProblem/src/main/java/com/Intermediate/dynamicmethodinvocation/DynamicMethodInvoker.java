package com.Intermediate.dynamicmethodinvocation;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvoker {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Create an instance of MathOperations
            MathOperations mathOps = new MathOperations();

            // Get class object
            Class<?> clazz = mathOps.getClass();

            // Take user input for method name
            System.out.print("Enter method name (add, subtract, multiply): ");
            String methodName = scanner.nextLine();

            // Get the method dynamically based on input
            Method method = clazz.getMethod(methodName, int.class, int.class);

            // Take user input for numbers
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Invoke the method dynamically
            Object result = method.invoke(mathOps, num1, num2);

            // Display the result
            System.out.println("Result: " + result);

            scanner.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

