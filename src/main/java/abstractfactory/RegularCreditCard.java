package abstractfactory;

import entity.CreditCard;

public class RegularCreditCard implements CreditCard {
    private double balance;

    @Override
    public void makePurchase(double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
