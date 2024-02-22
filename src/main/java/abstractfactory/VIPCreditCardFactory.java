package abstractfactory;

import entity.CreditCard;

public class VIPCreditCardFactory extends CreditCardFactory {
    @Override
    public CreditCard createCreditCard() {
        return new VIPCreditCard();
    }
}
