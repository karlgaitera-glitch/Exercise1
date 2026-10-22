package bank;
import java.util.Map;
import java.util.HashMap;

public class BankAccountManager {
    Map<Integer, BankAccount> accounts;
    int id;

    BankAccountManager(){
        this.accounts = new HashMap<>();
        this.id = 0;
    }
    
    public void addAccount(BankAccount account) {
        accounts.put(id++, account);
    }

    public BankAccount getAccount(int id) {
        return accounts.get(id);
    }

    



}
