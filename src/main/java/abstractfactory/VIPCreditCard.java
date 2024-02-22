package abstractfactory;

import entity.CreditCard;

public class VIPCreditCard implements CreditCard {
    private double balance; // The amount of money in the VIP credit card.

    @Override
    public void makePurchase(double amount) {
        balance += amount * 0.95; // When a purchase is made, 5% discount is applied for VIP cards.
    }

    @Override
    public double getBalance() {
        return balance; // Returns the current balance of the VIP credit card.
    }
}
