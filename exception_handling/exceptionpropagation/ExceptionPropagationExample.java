package exception_handling.exceptionpropagation;

import java.util.Scanner;

public class ExceptionPropagationExample {
    // Method with 'throws' to propagate exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Throwing an exception if inputs are invalid
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Taking user input
            System.out.print("Enter principal amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // Calling the method (exception may be propagated)
            double interest = calculateInterest(amount, rate, years);

            // Printing calculated interest
            System.out.println("Calculated Interest: " + interest);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } 
        finally {
            scanner.close();
        }
    }
}
