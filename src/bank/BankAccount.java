package bank;
import java.util.List;
import java.util.ArrayList;

/**
 * Represents a bank account that supports deposits, withdrawals, and freezing.
 */
public class BankAccount {
    private double balance;
    private boolean isFrozen;
    private final List<Transaction> transactionHistory;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
        this.transactionHistory = new ArrayList<>();
    }

    /**
     * Deposits a positive amount into the account unless it is frozen.
     *
     * @param amount the amount to deposit
     */
    public void deposit(double amount) {
        if (isFrozen()) {
            System.out.println("Account is FROZEN. Unable to transact.");
            return;
        }

        System.out.printf("Amount deposited: %.2f%n", amount);

        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return;
        }

        balance += amount;
        transactionHistory.add(new Transaction("Deposit", amount));
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    /**
     * Withdraws a positive amount from the account unless it is frozen.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) {
        if (isFrozen()) {
            System.out.println("Account is FROZEN. Unable to transact.");
            return;
        }

        System.out.printf("Amount withdrawn: %.2f%n", amount);

        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient balance.");
            System.out.printf("Current Balance: %.2f%n", balance);
            return;
        }

        balance -= amount;
        transactionHistory.add(new Transaction("Withdraw", amount));
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public double getBalance() {
        return balance;
    }

    public boolean freezeAccount() {
        this.isFrozen = true;
        return isFrozen;
    }

    public boolean unfreezeAccount() {
        this.isFrozen = false;
        return isFrozen;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public List<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }
}
