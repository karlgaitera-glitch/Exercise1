import bank.BankAccount;
import bank.SavingsAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new SavingsAccount("Test0");        
        account.deposit(1000.125);  
        account.deposit(0);      
    }
}
