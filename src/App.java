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
        System.out.println("\nEXERCISE 1:");

        // Test 1
        System.out.println("\nTest 1:");
        BankAccount account = new SavingsAccount("Test0");
        System.out.println(
                "Account Owner: "
                        + ((SavingsAccount) account).getOwnerName());

        // Test 2
        System.out.println("\nTest 2:");
        account.deposit(1000.125);

        // Test 3
        System.out.println("\nTest 3:");
        account.deposit(0);

        // Test 4
        System.out.println("\nTest 4:");
        account.deposit(-500.0);

        // Test 5
        System.out.println("\nTest 5:");
        account.withdraw(500.0);

        // Test 6
        System.out.println("\nTest 6:");
        account.withdraw(1500.0);

        // Test 7
        System.out.println("\nTest 7:");
        account.withdraw(-100.0);

        // Test 8
        System.out.println("\nTest 8:");
        account.freezeAccount();
        account.deposit(11500);

        // Test 9
        System.out.println("\nTest 9:");
        account.withdraw(500.0);

        // Test 10
        System.out.println("\nTest 10:");
        account.unfreezeAccount();
        account.withdraw(100);

        // Exercise2
        System.out.println("\n\nEXERCISE 2:");

        // Test 1
        System.out.println("\nTest 1:");
        System.out.println("Transaction history:");
        account.getTransactionHistory().forEach(System.out::println);

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

        // Exercise 3
        System.out.println("\n\nxercise3:");

        // Test 1
        System.out.println("\nTest 1:");
        account.deposit(-500.0);

        // Test 2
        System.out.println("\nTest 2:");
        account.freezeAccount();
        account.deposit(11500);

        // Test 3
        System.out.println("\nTest 3:");
        account.unfreezeAccount();
        account.withdraw(-100);

        // Test 4
        System.out.println("\nTest 4:");
        account.withdraw(1500);

        // Test 5
        System.out.println("\nTest 5:");
        account.freezeAccount();
        account.withdraw(500);

        // Test 6
        System.out.println("\nTest 6:");        
        accM1.printFilteredTransactions(
                200, account.getTransactionHistory());

        // Test 7
        System.out.println("\nTest 7:");       
        accM1.printTransactionsSortedByAmount(
                account.getTransactionHistory());
    }
}
