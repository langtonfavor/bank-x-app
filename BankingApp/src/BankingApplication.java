public class BankingApplication {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create and add customers to the bank
        Customer customer1 = new Customer("John Doe");
        Customer customer2 = new Customer("Jane Smith");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);

        // Perform operations and transactions
        Account currentAccount1 = customer1.getCurrentAccount();
        Account savingsAccount1 = customer1.getSavingsAccount();
        currentAccount1.deposit(1000.00);
        savingsAccount1.deposit(2000.00);

        try {
            // Attempt an invalid withdrawal

            currentAccount1.withdraw(2000.00);
        } catch (InvalidTransactionException e) {
            System.out.println("Invalid Transaction: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds: " + e.getMessage());
        }

        try {
            // Perform a valid withdrawal
            currentAccount1.withdraw(500.00);
        } catch (InvalidTransactionException e) {
            System.out.println("Invalid Transaction: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Insufficient Funds: " + e.getMessage());
        }

        // Display account balances and transactions
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Current Account Balance: " + currentAccount1.getBalance());
        System.out.println("Savings Account Balance: " + savingsAccount1.getBalance());
        System.out.println("Transactions: ");
        for (Transaction transaction : currentAccount1.getTransactions()) {
            System.out.println("Type: " + transaction.getType() + ", Amount: " + transaction.getAmount());
        }
        for (Transaction transaction : savingsAccount1.getTransactions()) {
            System.out.println("Type: " + transaction.getType() + ", Amount: " + transaction.getAmount());
        }
    }
}    