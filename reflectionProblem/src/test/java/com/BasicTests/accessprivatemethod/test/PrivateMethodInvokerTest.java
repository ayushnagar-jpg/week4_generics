package com.BasicTests.accessprivatemethod.test;
import static org.junit.Assert.assertEquals;
import java.lang.reflect.Method;
import org.junit.Test;

import com.Basic.privatemethod.Calculator;

public class PrivateMethodInvokerTest {

    @Test
    public void testInvokePrivateMultiplyMethod() {
        try {
            // Create a Calculator instance
            Calculator calculator = new Calculator();

            // Get the private method "multiply"
            Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
            multiplyMethod.setAccessible(true); // Enable access

            // Invoke the method with test values
            int result = (int) multiplyMethod.invoke(calculator, 7, 8);

            // Verify the expected result
            assertEquals(56, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
