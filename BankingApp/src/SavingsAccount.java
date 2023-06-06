import java.util.ArrayList;
import java.util.List;

class SavingsAccount implements Account {
    private double balance;
    private List<Transaction> transactions;

    public SavingsAccount(double initialBalance) {
        balance = initialBalance;
        transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        Transaction depositTransaction = new Transaction("Deposit", amount);
        transactions.add(depositTransaction);
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        // Implement the withdrawal logic for the savings account
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }
}