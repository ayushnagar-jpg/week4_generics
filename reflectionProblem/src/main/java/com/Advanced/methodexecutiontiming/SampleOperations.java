package com.Advanced.methodexecutiontiming;
public class SampleOperations {
    public void fastMethod() {
        // Simulating a fast operation
        System.out.println("Executing fastMethod...");
    }

    public void slowMethod() {
        // Simulating a slow operation
        System.out.println("Executing slowMethod...");
        try {
            Thread.sleep(1000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int computeSum(int a, int b) {
        return a + b;
    }
}
