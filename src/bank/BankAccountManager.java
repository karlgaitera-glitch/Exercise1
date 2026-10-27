package bank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Manages bank accounts and provides lookup by account ID.
 */
public class BankAccountManager implements Bank {
    private static final int MAX_ACCOUNTS = 100;
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
        if (accounts.size() >= MAX_ACCOUNTS) {
            System.out.println("Cannot add account: maximum of " + MAX_ACCOUNTS
                    + " accounts reached.");
            return;
        }

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
        accounts.forEach((accountId, account) -> {
            if (account instanceof SavingsAccount savingsAccount) {
                System.out.printf(
                        "Account ID: %d, Account Name: %s, Balance: %.2f%n",
                        accountId,
                        savingsAccount.getOwnerName(),
                        account.getBalance());
            }
        });
    }

    /**
     * Filters transactions with an amount greater than or equal to the
     * given amount.
     *
     * @param amount the minimum transaction amount
     * @param txList the transactions to filter
     * @return transactions at or above the specified amount
     */
    public List<Transaction> filterTransactionsAtOrAbove(double amount,
            List<Transaction> txList) {
        return txList.stream()
                .filter(transaction -> transaction.getAmount() >= amount)
                .toList();
    }

    /**
     * Sorts transactions by amount in ascending order.
     *
     * @param txList the transactions to sort
     * @return transactions sorted by amount
     */
    public List<Transaction> sortTransactionsByAmount(
            List<Transaction> txList) {
        return txList.stream()
                .sorted((first, second) -> Double.compare(first.getAmount(), second.getAmount()))
                .toList();
    }
}
