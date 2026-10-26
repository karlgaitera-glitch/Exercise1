package exceptions;

/**
 * Thrown when a withdrawal exceeds the available account balance.
 */
public class InsufficientFundsException extends Exception {    
    public InsufficientFundsException(String message) {
        super(message);
    }
}
