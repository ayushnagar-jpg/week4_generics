package annotation.custom_catching;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CachingTest {
    @Test
     public void testFibonacciCaching() {
        ExpensiveComputation computation = new ExpensiveComputation();
        long startTime = System.nanoTime();
        int result1 = computation.fibonacci(20);
        long duration1 = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        int result2 = computation.fibonacci(20);
        long duration2 = System.nanoTime() - startTime;

        assertEquals(result1,result2);
        assertTrue(duration2<duration1);
    }
}
