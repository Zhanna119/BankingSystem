package entity;

public class VIPAccount extends Account {
    @Override
    protected void logTransaction(String message) {
        System.out.println("VIP Log: " + message); // Log transactions specifically for VIP accounts.
    }
}

