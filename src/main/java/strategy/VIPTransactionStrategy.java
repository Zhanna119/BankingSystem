package strategy;

public class VIPTransactionStrategy implements TransactionStrategy {
    @Override
    public void performTransaction(double amount) {
        System.out.println("Performing transaction for VIP account: deposit $" + (amount * 1.02));
        // VIP account receives a 2% bonus for deposits
    }
}

