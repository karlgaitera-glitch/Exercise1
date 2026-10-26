package bank;

/**
 * Defines operations for managing bank accounts.
 */
public interface Bank {
    /**
     * Adds an account to the bank.
     *
     * @param account the account to add
     */
    void addAccount(BankAccount account);
    
    /**
     * Looks up an account by its ID.
     *
     * @param id the account ID
     * @return the matching account, or {@code null} if none exists
     */
    BankAccount getAccount(int id);
}
