package collections.Projects.BankingSystem;
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        TransactionManager manager = new TransactionManager(bank);

        // Creating accounts
        bank.addAccount("1001", 5000);
        bank.addAccount("1002", 3000);
        bank.addAccount("1003", 7000);

        // Depositing money
        manager.deposit("1001", 2000);
        manager.deposit("1002", 1000);

        // Withdrawing money
        manager.withdraw("1003", 500);
        manager.withdraw("1002", 5000); // Should fail (Insufficient funds)

        // Display sorted accounts by balance
        bank.displaySortedAccounts();
    }
}
