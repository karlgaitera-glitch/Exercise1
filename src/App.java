import bank.BankAccount;
import bank.BankAccountManager;
import bank.SavingsAccount;

/**
 * Demonstrates bank account operations.
 */
public class App {

    /**
     * Runs the bank account demonstration.
     *
     * @param args command-line arguments
     * @throws Exception if a bank account operation fails
     */
    public static void main(String[] args) throws Exception {
        // Exercise 1
        // Test 1
        System.out.println("Test 1:");
        BankAccount account = new SavingsAccount("Test0");
        System.out.println(
            "Account Owner: "
                + ((SavingsAccount) account).getOwnerName());

        // Test 2
        System.out.println("\nTest 2:");
        account.deposit(1000.125);

        // Test 3
        System.out.println("\nTest 3:");
        try {
            account.deposit(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 4
        System.out.println("\nTest 4:");
        try {
            account.deposit(-500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 5
        System.out.println("\nTest 5:");
        try {
            account.withdraw(500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 6
        System.out.println("\nTest 6:");
        try {
            account.withdraw(1500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.printf("Current Balance: %.2f%n", account.getBalance());
        }

        // Test 7
        System.out.println("\nTest 7:");
        try {
            account.withdraw(-100.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 8
        System.out.println("\nTest 8:");
        try {
            account.freezeAccount();
            account.deposit(11500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 9
        System.out.println("\nTest 9:");
        try {
            account.withdraw(500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 10
        System.out.println("\nTest 10:");
        try {
            account.unfreezeAccount();
            account.withdraw(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Exercise2
        // Test 1
        System.out.println("\n\nTest 1:");
        System.out.println("Transaction history:");
        System.out.println(account.getTransactionHistory());

        // Test 2
        System.out.println("\nTest 2:");
        BankAccountManager accM1 = new BankAccountManager();

        // Test 3
        System.out.println("\nTest 3:");
        accM1.addAccount(account);

        // Test 4
        System.out.println("\nTest 4:");
        accM1.addAccount(new SavingsAccount("Test1"));

        // Test 5
        System.out.println("\nTest 5:");
        accM1.listAccounts();

        // Exercise3
        // Test 1
        System.out.println("\n\nTest 1:");
        try {
            account.deposit(-500.0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test2
        System.out.println("\nTest 2:");
        try {
            account.freezeAccount();
            account.deposit(11500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 3
        System.out.println("\nTest 3:");
        try {
            account.unfreezeAccount();
            account.withdraw(-100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 4
        System.out.println("\nTest 4:");
        try {
            account.withdraw(1500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.printf("Current Balance: %.2f%n", account.getBalance());
        }

        // Test 5
        System.out.println("\nTest 5:");
        try {
            account.freezeAccount();
            account.withdraw(500);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Test 6
        System.out.println("\nTest 6:");
        System.out.println("Filtering transactions at or above 200...");
        System.out.println(accM1.filterTransactionsAtOrAbove(
            200, account.getTransactionHistory()));

        // Test 7
        System.out.println("\nTest 7:");
        System.out.println("Sorting transactions by amount...");
        System.out.println(accM1.sortTransactionsByAmount(
            account.getTransactionHistory()));
    }
}
