package exception_handling.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Asking user for input
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            // Performing division
            int result = numerator / denominator;

            // Displaying result
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");
        } 
        finally {
            scanner.close(); // Closing the scanner to avoid memory leaks
        }
    }
}
