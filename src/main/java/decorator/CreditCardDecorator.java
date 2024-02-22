package decorator;

import entity.CreditCard;

public interface CreditCardDecorator extends CreditCard {
    void addBonusPoints(double amount);
}