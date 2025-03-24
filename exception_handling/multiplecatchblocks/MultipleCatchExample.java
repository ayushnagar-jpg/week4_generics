package exception_handling.multiplecatchblocks;

import java.util.Scanner;

public class MultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example array (can also be null to test NullPointerException)
        Integer[] numbers = {10, 20, 30, 40, 50}; // Change to 'null' for testing NullPointerException

        try {
            // Taking user input for index
            System.out.print("Enter index number: ");
            int index = scanner.nextInt();

            // Retrieving value at index
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } 
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } 
        finally {
            scanner.close();
        }
    }
}
