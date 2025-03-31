package com.IntermediateTests.com.Intermediate.dynamicmethodinvocation.test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;
import org.junit.Test;
import com.Intermediate.dynamicmethodinvocation.MathOperations;

public class DynamicMethodInvokerTest {

    @Test
    public void testDynamicAddition() {
        try {
            MathOperations mathOps = new MathOperations();

            // Get the 'add' method dynamically
            Method method = MathOperations.class.getMethod("add", int.class, int.class);

            // Invoke the method
            Object result = method.invoke(mathOps, 10, 5);

            // Verify the result
            assertEquals(15, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDynamicSubtraction() {
        try {
            MathOperations mathOps = new MathOperations();

            // Get the 'subtract' method dynamically
            Method method = MathOperations.class.getMethod("subtract", int.class, int.class);

            // Invoke the method
            Object result = method.invoke(mathOps, 10, 5);

            // Verify the result
            assertEquals(5, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDynamicMultiplication() {
        try {
            MathOperations mathOps = new MathOperations();

            // Get the 'multiply' method dynamically
            Method method = MathOperations.class.getMethod("multiply", int.class, int.class);

            // Invoke the method
            Object result = method.invoke(mathOps, 10, 5);

            // Verify the result
            assertEquals(50, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
