package exception_handling.banktransactionsystem;

import java.util.Scanner;

//Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

class BankAccount {
 private double balance;

 // Constructor
 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Withdraw Method with Exception Handling
 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount < 0) {
         throw new IllegalArgumentException("Invalid amount!");
     }
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient balance!");
     }
     balance -= amount;
     System.out.println("Withdrawal successful, new balance: " + balance);
 }

 public double getBalance() {
     return balance;
 }
}

public class BankTransactionSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Initialize account with an initial balance of 5000
     BankAccount account = new BankAccount(5000);

     try {
         System.out.print("Enter amount to withdraw: ");
         double amount = scanner.nextDouble();
         
         // Attempt withdrawal
         account.withdraw(amount);
     } 
     catch (IllegalArgumentException e) {
         System.out.println(e.getMessage());
     } 
     catch (InsufficientBalanceException e) {
         System.out.println(e.getMessage());
     } 
     finally {
         scanner.close();
         System.out.println("Transaction completed.");
     }
 }
}
