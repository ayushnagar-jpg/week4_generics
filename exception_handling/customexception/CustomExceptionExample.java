package exception_handling.customexception;

import java.util.Scanner;

//Step 1: Define a Custom Exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class CustomExceptionExample {
 // Step 2: Method to validate age
 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or above");
     }
     System.out.println("Access granted!");
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     try {
         // Step 3: Take user input
         System.out.print("Enter your age: ");
         int age = scanner.nextInt();

         // Step 4: Validate age
         validateAge(age);
     } 
     catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     } 
     catch (Exception e) {
         System.out.println("Invalid input. Please enter a valid age.");
     } 
     finally {
         scanner.close();
     }
 }
}
