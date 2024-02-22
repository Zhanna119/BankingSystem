import abstractfactory.CreditCardFactory;
import abstractfactory.RegularCreditCardFactory;
import abstractfactory.VIPCreditCardFactory;
import decorator.BonusPointsDecorator;
import decorator.CreditCardDecorator;
import entity.Account;
import entity.CreditCard;
import entity.SavingsAccount;
import factorymethod.AccountFactory;
import factorymethod.SavingsAccountFactory;
import factorymethod.VIPAccountFactory;
import strategy.SavingsTransactionStrategy;
import strategy.TransactionStrategy;
import strategy.VIPTransactionStrategy;
import templatemethod.LoggingAccount;

public class Main {
    public static void main(String[] args) {
        // Template method
        System.out.println("=== Template Method ===");
        LoggingAccount loggingAccount = new LoggingAccount();
        loggingAccount.deposit(1000.0);
        loggingAccount.withdraw(550.0);
        System.out.println("Account Balance: " + loggingAccount.getBalance());
        System.out.println();

        // Abstract factory
        System.out.println("=== Abstract Factory ===");
        CreditCardFactory regularFactory = new RegularCreditCardFactory();
        CreditCard regularCard = regularFactory.createCreditCard();
        regularCard.makePurchase(100.0);
        System.out.println("Regular card balance: " + regularCard.getBalance());

        CreditCardFactory vipFactory = new VIPCreditCardFactory();
        CreditCard vipCard = vipFactory.createCreditCard();
        vipCard.makePurchase(100.0);
        vipCard.makePurchase(100.0);
        System.out.println("VIP card balance: " + vipCard.getBalance());
        System.out.println();

        // Decorator
        System.out.println("=== Decorator ===");
        CreditCardFactory creditCardFactory = new RegularCreditCardFactory();
        CreditCard creditCard = creditCardFactory.createCreditCard();
        CreditCardDecorator bonusPointsDecorator = new BonusPointsDecorator(creditCard);
        bonusPointsDecorator.makePurchase(100.0);
        bonusPointsDecorator.addBonusPoints(100);
        System.out.println("Regular card balance with bonus points: " + bonusPointsDecorator.getBalance());
        System.out.println();

        // Facade
        System.out.println("=== Facade ===");
        Account savingsAccount = new SavingsAccount();
        System.out.println("Initial savings account balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(100.0);
        System.out.println("Savings account balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(50.0);
        System.out.println("Savings account balance after withdrawal: " + savingsAccount.getBalance());
        System.out.println();

        // Factory method
        System.out.println("=== Factory Method ===");
        AccountFactory savingsFactory = new SavingsAccountFactory();
        Account vipAccount = new VIPAccountFactory().createAccount();

        // Creating savings account instance
        Account savingsAccountFactory = savingsFactory.createAccount(); // Creating a new savings account

        System.out.println("Created savings account: " + savingsAccountFactory); // Outputting the created savings account
        System.out.println("Created VIP account: " + vipAccount);

        savingsAccountFactory.deposit(1000.0); // Depositing money into the savings account
        vipAccount.deposit(2000.0); // Depositing money into the VIP account

        savingsAccountFactory.withdraw(250.0); // Withdrawing money from the savings account
        vipAccount.withdraw(350.0); // Withdrawing money from the VIP account

        System.out.println("Savings account balance: " + savingsAccountFactory.getBalance()); // Outputting the balance of the savings account
        System.out.println("VIP account balance: " + vipAccount.getBalance());
        System.out.println();


        // Strategy
        System.out.println("=== Strategy ===");
        TransactionStrategy savingsStrategy = new SavingsTransactionStrategy();
        TransactionStrategy vipStrategy = new VIPTransactionStrategy();
        performTransaction(savingsStrategy, 1000.0); // Transaction on savings account
        performTransaction(vipStrategy, 2000.0); // Transaction on VIP account
    }

    private static void performTransaction(TransactionStrategy strategy, double amount) {
        strategy.performTransaction(amount);
    }
}


