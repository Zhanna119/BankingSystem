package facade;

import entity.Account;
import entity.CreditCard;

import java.util.ArrayList;
import java.util.List;

// Class for managing the banking system
public class BankingSystem {
    private List<Account> accounts = new ArrayList<>(); // List to store accounts in the banking system.
    private List<CreditCard> creditCards = new ArrayList<>(); // List to store credit cards in the banking system.

    // Method to add an account to the banking system.
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to add a credit card to the banking system.
    public void addCreditCard(CreditCard creditCard) {
        creditCards.add(creditCard);
    }

    // Method to retrieve a list of accounts in the banking system.
    public List<Account> getAccounts() {
        return accounts;
    }

    // Method to retrieve a list of credit cards in the banking system.
    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
}

