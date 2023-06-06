class Customer {
    private String name;
    private Account currentAccount;
    private Account savingsAccount;

    public Customer(String name) {
        this.name = name;
        currentAccount = new CurrentAccount();
        savingsAccount = new SavingsAccount(500.00);
    }

    public String getName() {
        return name;
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public Account getSavingsAccount() {
        return savingsAccount;
    }

}

