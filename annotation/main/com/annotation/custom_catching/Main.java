package annotation.custom_catching;

public class Main {
    public static void main(String[] args) {
        ExpensiveComputation computation = new ExpensiveComputation();
        System.out.println("Calculating Fibonacci of 20 for the first time...");
        long startTime = System.nanoTime();
        int result1 = computation.fibonacci(20);
        long duration1 = System.nanoTime() - startTime;
        System.out.println("Result: " + result1 + ", Time: " + duration1 + " ns");

        System.out.println("Calculating Fibonacci of 20 again (should be faster)...");
        startTime = System.nanoTime();
        int result2 = computation.fibonacci(20);
        long duration2 = System.nanoTime() - startTime;
        System.out.println("Result: " + result2 + ", Time: " + duration2 + " ns");
    }
}

