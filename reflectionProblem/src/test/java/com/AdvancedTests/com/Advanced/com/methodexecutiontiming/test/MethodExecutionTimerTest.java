package com.AdvancedTests.com.Advanced.com.methodexecutiontiming.test;
import org.junit.Test;

import com.Advanced.methodexecutiontiming.SampleOperations;

import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;

public class MethodExecutionTimerTest {
    @Test
    public void testMethodExecutionTime() {
        SampleOperations sample = new SampleOperations();

        long fastMethodTime = getExecutionTime(sample, "fastMethod");
        long slowMethodTime = getExecutionTime(sample, "slowMethod");

        // Ensure slowMethod takes longer than fastMethod
        assertTrue("slowMethod should take longer than fastMethod", slowMethodTime > fastMethodTime);
    }

    private long getExecutionTime(Object obj, String methodName) {
        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getMethod(methodName);

            long startTime = System.nanoTime();
            method.invoke(obj);
            long endTime = System.nanoTime();

            return (endTime - startTime) / 1_000_000; // Convert to milliseconds
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
