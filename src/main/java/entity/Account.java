package entity;

import strategy.TransactionStrategy;

public abstract class Account {
    protected double balance; // The amount of money in the account.

    public double getBalance() {
        return balance; // Get the current balance of the account.
    }

    public void deposit(double amount) {
        balance += amount; // Add the deposited amount to the account balance.
        logTransaction("Deposit of " + amount); // Log the deposit transaction.
    }

    public void withdraw(double amount) {
        balance -= amount; // Subtract the withdrawn amount from the account balance.
        logTransaction("Withdrawal of " + amount); // Log the withdrawal transaction.
    }

    protected abstract void logTransaction(String message); // Abstract method to log transactions.

    public void setTransactionStrategy(TransactionStrategy transactionStrategy) {
        // This method could be used to set transaction strategy if needed.
        // Currently, it's not implemented with any logic.
    }
}
