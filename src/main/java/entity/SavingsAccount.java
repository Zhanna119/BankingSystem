package entity;

public class SavingsAccount extends Account {
    @Override
    protected void logTransaction(String message) {
        System.out.println("Log: " + message);
    }
}

