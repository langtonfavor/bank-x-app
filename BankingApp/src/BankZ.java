// BankZ class representing Bank Z, implementing the BankService interface
import java.util.ArrayList;
import java.util.List;

class BankZ implements BankService {
    private List<Transaction> processedTransactions;

    public BankZ() {
        processedTransactions = new ArrayList<>();
    }

    @Override
    public void processSingleTransaction(Customer customer, Transaction transaction) throws InsufficientFundsException, InvalidTransactionException {
        // Perform the necessary debit or credit operation on the customer's account
        Account currentAccount = customer.getCurrentAccount();
        if (transaction.getType().equals("debit")) {
            currentAccount.withdraw(transaction.getAmount());
        } else if (transaction.getType().equals("credit")) {
            currentAccount.deposit(transaction.getAmount());
        }

        // Add the transaction to the processed transactions list
        processedTransactions.add(transaction);
    }

    @Override
    public void processTransactionList(Customer customer, List<Transaction> transactions) throws InsufficientFundsException, InvalidTransactionException {
        // Process each transaction in the list
        for (Transaction transaction : transactions) {
            processSingleTransaction(customer, transaction);
        }
    }

    @Override
    public List<Transaction> getProcessedTransactions(Customer customer) {
        // Retrieve the list of processed transactions
        return processedTransactions;
    }
}