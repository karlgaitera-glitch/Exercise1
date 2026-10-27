package bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a bank transaction, including its type, amount, and timestamp.
 */
public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timeStamp;

    /**
     * Creates a transaction with the given type and amount.
     *
     * @param type   the transaction type
     * @param amount the transaction amount
     */
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timeStamp = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction [type=" + type
                + ", amount=" + String.format("%.2f", amount)
                + ", time_stamp="
                + timeStamp.format(DateTimeFormatter.ofPattern("hh:mm:ss"))
                + "]";
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}
