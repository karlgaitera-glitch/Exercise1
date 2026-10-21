package bank;

public class BankAccount {
    double balance;
    boolean isFrozen;

    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    public void deposit(double amount) {
        if (isFrozen()) {
            throw new IllegalStateException("Account is frozen. Cannot deposit.");
        }        
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid. Amount must be greater than zero.");
        }        
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (isFrozen()) {
            throw new IllegalStateException("Account is frozen. Cannot withdraw.");
        }        
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid. Amount must be greater than zero.");
        }        
        balance -= amount;
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);
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
