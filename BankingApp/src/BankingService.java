import java.util.ArrayList;
import java.util.List;

// BankService interface representing the services provided by Bank Z
interface BankService {
    void processSingleTransaction(Customer customer, Transaction transaction) throws InsufficientFundsException, InvalidTransactionException;
    void processTransactionList(Customer customer, List<Transaction> transactions) throws InsufficientFundsException, InvalidTransactionException;
    List<Transaction> getProcessedTransactions(Customer customer);
}