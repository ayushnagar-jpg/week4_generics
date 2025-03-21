package collections.Projects.BankingSystem;
import java.util.*;

public class Bank {
    private Map<String, Account> accounts; // Stores accounts
    private TreeMap<Double, String> sortedAccounts; // Sorts by balance
    private Queue<String> withdrawalQueue; // Processes withdrawals

    public Bank() {
        accounts = new HashMap<>();
        sortedAccounts = new TreeMap<>();
        withdrawalQueue = new LinkedList<>();
    }

    public void addAccount(String accNumber, double balance) {
        Account account = new Account(accNumber, balance);
        accounts.put(accNumber, account);
        sortedAccounts.put(balance, accNumber);
    }

    public Account getAccount(String accNumber) {
        return accounts.get(accNumber);
    }

    public void queueWithdrawal(String accNumber) {
        if (accounts.containsKey(accNumber)) {
            withdrawalQueue.add(accNumber);
        } else {
            System.out.println("Account not found: " + accNumber);
        }
    }

    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            String accNumber = withdrawalQueue.poll();
            Account account = accounts.get(accNumber);
            if (account != null && account.withdraw(amount)) {
                System.out.println("Withdrawal successful for account: " + accNumber);
            } else {
                System.out.println("Insufficient balance in account: " + accNumber);
            }
        }
    }

    public void displaySortedAccounts() {
        System.out.println("\nAccounts Sorted by Balance:");
        for (Map.Entry<Double, String> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " - Balance: $" + entry.getKey());
        }
    }
}
