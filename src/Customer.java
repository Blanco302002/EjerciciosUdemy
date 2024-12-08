public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer() {
        this("Default name", "defaultEmail@gmail.com");
        System.out.println("Constructor of three parameters called.");
    } // we pass the name and emailaddress to the following constructor.

    public Customer(String name, String emailAddress) {
        this(name, 10000.00, emailAddress); // should be like this. And the 10000.00 credit limit is set on the main constructor.
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
        System.out.println("Main constructor called.");
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
