import java.util.ArrayList;
import java.util.List;

class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
