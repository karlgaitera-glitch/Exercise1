package bank;
import java.time.LocalDateTime;

public class Transaction {
    String type;
    double amount;
    LocalDateTime time_stamp;

    Transaction(String type, double amount){
        this.type = type;
        this.amount = amount;
        this.time_stamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{type='" + type
            + "', amount=" + amount
            + ", time_stamp=" + time_stamp + "}";
    }
}
