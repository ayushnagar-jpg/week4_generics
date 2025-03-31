package com.Basic.privatemethod;
import java.lang.reflect.Method;

public class PrivateMethodInvoker {
    public static void main(String[] args) {
        try {
            // Create an instance of Calculator
            Calculator calculator = new Calculator();

            // Get the class object
            Class<?> clazz = calculator.getClass();

            // Access the private method "multiply"
            Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Allow invocation

            // Invoke the method with arguments (5, 10)
            int result = (int) multiplyMethod.invoke(calculator, 5, 10);

            // Print the result
            System.out.println("Result of multiplication: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
