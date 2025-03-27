package com.performancetesting;

public class TaskManager {
    // ✅ Simulates a long-running task
    public static String longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a 3-second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Task Completed";
    }
}
