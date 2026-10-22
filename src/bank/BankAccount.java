package bank;

public class BankAccount {
    private double balance;
    private boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

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
        System.out.printf("Current Balance: %.2f%n", balance);
    }

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
}
