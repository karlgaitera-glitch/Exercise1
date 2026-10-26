package exceptions;

/**
 * Thrown when a deposit or withdrawal amount is zero or negative.
 */
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
