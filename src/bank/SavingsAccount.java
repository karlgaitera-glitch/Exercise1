package bank;

public class SavingsAccount extends BankAccount {
    String ownerName;

    public SavingsAccount(String ownerName) {        
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }
}
