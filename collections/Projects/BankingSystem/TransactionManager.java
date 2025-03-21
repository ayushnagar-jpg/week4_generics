package collections.Projects.BankingSystem;
public class TransactionManager {
    private Bank bank;

    public TransactionManager(Bank bank) {
        this.bank = bank;
    }

    public void deposit(String accNumber, double amount) {
        Account account = bank.getAccount(accNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposited $" + amount + " to Account: " + accNumber);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(String accNumber, double amount) {
        bank.queueWithdrawal(accNumber);
        bank.processWithdrawals(amount);
    }
}
