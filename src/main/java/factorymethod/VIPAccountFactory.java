package factorymethod;

import entity.Account;
import entity.VIPAccount;

public class VIPAccountFactory extends AccountFactory {
    @Override
    public Account createAccount() {
        return new VIPAccount();
    }
}
