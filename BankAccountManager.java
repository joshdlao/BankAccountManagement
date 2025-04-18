package BankAccountManager;

public class BankAccountManager {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private static int counter = 1000;


    public void deposit(double amount) {
        if (amount <=0) {
            System.out.println("Invalid Number Try again!");
        } else {
            balance += amount;
            System.out.println("Deposit successful!");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else if (amount <= 0) {
            System.out.println("Invalid Number Try again!");
        } else {
            balance -= amount;
            System.out.println("Withdraw successful!");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }    

    public void setOwner(String name) {
        this.ownerName = name;
        this.accountNumber = "ACC" + (++counter);

        System.out.println("Account created with " + accountNumber);
    }

    public String getAccountDetails() {
        return "Account Number: " + accountNumber 
        + "\nOwner: " + ownerName +
        "\nBalance: " + balance;
    }
    
}
