package bank;

import java.time.LocalDateTime;

/**
 * Represents a bank transaction, including its type, amount, and timestamp.
 */
public class Transaction {
    String type;
    double amount;
    LocalDateTime timeStamp;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timeStamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction [type=" + type
            + ", amount=" + amount
            + ", time_stamp=" + timeStamp
            + "]";
    }
}
