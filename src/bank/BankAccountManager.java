package bank;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages bank accounts and provides lookup by account ID.
 */
public class BankAccountManager implements Bank {
    private Map<Integer, BankAccount> accounts;
    private int id;

    public BankAccountManager() {
        this.accounts = new HashMap<>();
        this.id = 0;
    }
    
    /**
     * Adds an account to the manager.
     *
     * @param account the account to add
     */
    public void addAccount(BankAccount account) {
        int accountId = id++;
        accounts.put(accountId, account);
        System.out.println("Account added successfully with ID: " + accountId);
    }

    public BankAccount getAccount(int id) {
        return accounts.get(id);
    }
    
    /**
     * Lists the accounts managed by this bank.
     */
    public void listAccounts() {
        for (Map.Entry<Integer, BankAccount> entry : accounts.entrySet()) {
            BankAccount account = entry.getValue();

            if (account instanceof SavingsAccount savingsAccount) {
                System.out.printf(
                    "Account ID: %d, Account Name: %s, Balance: %.2f%n",
                    entry.getKey(),
                    savingsAccount.getOwnerName(),
                    account.getBalance()
                );
            }
        }
    }





    



}
