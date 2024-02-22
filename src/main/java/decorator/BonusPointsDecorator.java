package decorator;

import entity.CreditCard;

public class BonusPointsDecorator implements CreditCardDecorator {
    private CreditCard decoratedCreditCard; // The credit card being decorated.

    public BonusPointsDecorator(CreditCard decoratedCreditCard) {
        this.decoratedCreditCard = decoratedCreditCard; // Initialize the decorated credit card.
    }

    @Override
    public void makePurchase(double amount) {
        decoratedCreditCard.makePurchase(amount); // Make a purchase using the decorated credit card.
    }

    @Override
    public double getBalance() {
        return decoratedCreditCard.getBalance(); // Get the current balance of the decorated credit card.
    }

    @Override
    public void addBonusPoints(double amount) {
        double bonusPoints = amount * 0.1; // Calculate bonus points: 10% of the purchase amount.
        decoratedCreditCard.makePurchase(bonusPoints); // Make a purchase using the bonus points.
    }
}
