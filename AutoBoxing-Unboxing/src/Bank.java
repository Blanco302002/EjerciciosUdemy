import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> CustomerList;

    public Bank(String name) {
        this.name = name;
        this.CustomerList = new ArrayList<>();
    }
    public Customer searchCustomer(String name) {
        for (Customer element : CustomerList) {
            if (element.getName().equals(name)) {
                return element;
            }
        }
        return null;
    }
    public boolean addCustomer(String name) {
        if (searchCustomer(name) != null) {
            System.out.println("This customer Already Exists");
            return false;
        } else {
            CustomerList.add(new Customer(name)); // agrego el customer
            return true;
        }
    }
    public boolean addTransaction(double amount, String customerName) {
        // we ask for the amount and the name of the customer.
        Customer customer = searchCustomer(customerName);
        if (customer != null) {
            // The customer exists so we can add the transaction
            customer.getTransactions().add(amount); // autoboxing
            return true;
        } else {
            return false;
        }
    }
    public void printTransactions(String name) {
        // le pasamos el nombre del usuario el cual queremos que imprima la lista de transacciones
        Customer customer = searchCustomer(name);
        if (customer != null) {
            System.out.println("customer's name is : " + customer.getName());
            System.out.println("The Transactions are...");
            System.out.println(customer.getTransactions());
        }
    }

}
