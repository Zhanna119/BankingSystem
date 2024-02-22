package factorymethod;

import entity.Account;
import entity.SavingsAccount;

public class SavingsAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new SavingsAccount();
    }
}
