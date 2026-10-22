import bank.BankAccount;
import bank.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {

        // Test 1
        System.out.println("Test 1:");
        BankAccount account = new SavingsAccount("Test0");
        System.out.println("Account Owner: " + ((SavingsAccount) account).getOwnerName());

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
        account.withdraw(500);

        // Test 10
        System.out.println("\nTest 10:");
        account.unfreezeAccount();
        account.withdraw(100);
    }
}
