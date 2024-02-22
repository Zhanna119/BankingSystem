package strategy;

public class SavingsTransactionStrategy implements TransactionStrategy {
    @Override
    public void performTransaction(double amount) {
        System.out.println("Performing transaction for savings account: deposit $" + amount);
        // Additional logic for savings account if necessary
    }
}


