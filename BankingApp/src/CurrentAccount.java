import java.util.ArrayList;
import java.util.List;

class CurrentAccount implements Account {
    private double balance;
    private List<Transaction> transactions;

    public CurrentAccount() {
        balance = 0.0;
        transactions = new ArrayList<>();
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if (balance - amount >= 0) {
            balance -= amount;
        } else {
            throw new InsufficientFundsException("Insufficient funds in Current Account.");
        }
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
    public void makePayment(double amount, Account recipient) throws InsufficientFundsException {
        double transactionFee = amount * 0.0005; // Calculate transaction fee (0.05% of the transaction amount)
        double totalAmount = amount + transactionFee;
        withdraw(totalAmount);
        recipient.deposit(amount);

        Transaction paymentTransaction = new Transaction("Payment", amount);
        transactions.add(paymentTransaction);
        Transaction feeTransaction = new Transaction("Fee", transactionFee);
        transactions.add(feeTransaction);
    }
}