import java.util.ArrayList;
import java.util.List;

// Bank class representing Bank X
class Bank {
    private List<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
