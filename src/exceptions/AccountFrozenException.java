package exceptions;

/**
 * Thrown when an operation is attempted on a frozen account.
 */
public class AccountFrozenException extends Exception {
    public AccountFrozenException(String message) {
        super(message);
    }
}
