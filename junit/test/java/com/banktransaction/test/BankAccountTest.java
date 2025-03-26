package com.banktransaction.test;
import com.banktransaction.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    // ✅ Test deposit functionality
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), "Balance should be updated after deposit");
    }

    // ✅ Test withdrawal with sufficient balance
    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount(200);
        account.withdraw(50);
        assertEquals(150, account.getBalance(), "Balance should be updated after withdrawal");
    }

    // ✅ Test withdrawal failure due to insufficient funds
    @Test
    void testWithdrawInsufficientFunds() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> account.withdraw(150),
            "Should throw exception for insufficient funds");
        assertEquals("Insufficient funds", exception.getMessage());
    }

    // ✅ Test deposit failure for negative amount
    @Test
    void testDepositNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> account.deposit(-50),
            "Should throw exception for negative deposit");
        assertEquals("Deposit amount must be positive", exception.getMessage());
    }

    // ✅ Test withdrawal failure for negative amount
    @Test
    void testWithdrawNegativeAmount() {
        BankAccount account = new BankAccount(100);
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> account.withdraw(-20),
            "Should throw exception for negative withdrawal");
        assertEquals("Withdrawal amount must be positive", exception.getMessage());
    }

    // ✅ Test creating an account with a negative initial balance
    @Test
    void testNegativeInitialBalance() {
        Exception exception = assertThrows(IllegalArgumentException.class, 
            () -> new BankAccount(-100),
            "Should throw exception for negative initial balance");
        assertEquals("Initial balance cannot be negative", exception.getMessage());
    }
}
