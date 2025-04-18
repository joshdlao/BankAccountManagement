package BankAccountManager;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Bank Account Manager!\r\n" + //
        "1. Create account\r\n" + //
        "2. Deposit\r\n" + //
        "3. Withdraw\r\n" + //
        "4. View account\r\n" + //
        "5. Exit");

        Main.choice();
    }

    static void choice() {

        BankAccountManager bankAccountManager = new BankAccountManager();
        boolean isGood = true;

        while (isGood) {
            System.out.println("");
            
            System.out.print("Enter choice: ");
            int answer = sc.nextInt();
            sc.nextLine();

            

            if (answer == 1) {
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                bankAccountManager.setOwner(name);
        
            } else if (answer == 2 && hasAccount(bankAccountManager)) {
                System.out.print("Enter amount to Deposit: ");
                int depositBalance = sc.nextInt();
                bankAccountManager.deposit(depositBalance);
        
            } else if (answer == 3 && hasAccount(bankAccountManager)) {
                System.out.print("Enter amount to Withdraw: ");
                int withdrawBalance = sc.nextInt();
                bankAccountManager.withdraw(withdrawBalance);
        
            } else if (answer == 4 && hasAccount(bankAccountManager)) {
                System.out.println(bankAccountManager.getAccountDetails());
        
            } else if (answer == 5 && hasAccount(bankAccountManager)) {
                System.out.println("Thanks :D");
                isGood = false;
        
            } else if (!hasAccount(bankAccountManager)) {
                System.out.println("Please create an account first.");
            } else {
                System.out.println("Invalid option.");
            }
        }
    }

    static boolean hasAccount(BankAccountManager bam) {
        return bam.getOwnerName() != null;
    }
}
