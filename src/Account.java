import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void makeDeposit(double deposit) {
        this.balance += deposit;
        System.out.println("The deposit has been successful.");
    }
    public void withdrawDeposit(double deposit) {
        if (this.balance < deposit) {
            System.out.println("Sorry, not enough balance for this withdraw.");
        } else {
            this.balance -= deposit;
            System.out.println("The withdraw has been successful");
        }
    }
}
