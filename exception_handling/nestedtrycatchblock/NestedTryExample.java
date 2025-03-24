package exception_handling.nestedtrycatchblock;

import java.util.Scanner;

public class NestedTryExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        try {
            // Taking index input
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();

            try {
                // Accessing element
                int value = numbers[index];

                // Taking divisor input
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                // Performing division
                int result = value / divisor;
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        } 
        finally {
            scanner.close(); // Ensures scanner is closed
            System.out.println("Operation completed.");
        }
    }
}
