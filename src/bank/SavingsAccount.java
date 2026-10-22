package bank;

/** Represents a savings account with an associated owner name. */
public class SavingsAccount extends BankAccount {
  private String ownerName;

  public SavingsAccount(String ownerName) {
    this.ownerName = ownerName;
  }

  public String getOwnerName() {
    return ownerName;
  }
}
