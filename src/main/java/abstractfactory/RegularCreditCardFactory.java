package abstractfactory;

import entity.CreditCard;

public class RegularCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new RegularCreditCard();
    }
}
