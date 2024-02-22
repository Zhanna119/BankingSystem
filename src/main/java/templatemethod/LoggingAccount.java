package templatemethod;

import entity.Account;

public class LoggingAccount extends Account {
    @Override
    protected void logTransaction(String message) {
        System.out.println("Log: " + message);
    }
}


