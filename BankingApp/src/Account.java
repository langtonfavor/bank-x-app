import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InvalidTransactionException, InsufficientFundsException;
    double getBalance();
    void addTransaction(Transaction transaction);
    List<Transaction> getTransactions();
}