package ATM;
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;

    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount >  0) {
            balance += amount;
            System.out.println("Deposit Successful. New Balance: "+balance);
        }
        else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    public void Withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawl successful. New Balance: "+balance);
        }
        else{
            System.out.println("Insufficient funds or invalid amount for withdrawl.");
        }
    }
}
    
    class ATM {
        private BankAccount account;
        private Scanner scanner;

        public ATM(BankAccount account){
            this.account = account;
            this.scanner = new Scanner(System.in);
        }
        public void showChoice() {
            System.out.println("1. Check Balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. Exit.");

        }

        public void run() {
            int Option;
            do {
                showChoice();
                System.out.println("Enter Your Option.: ");
                Option = scanner.nextInt();
                switch (Option) {
                    case 1:
                        checkBalance();
                        break;

                    case 2:
                        Deposit();
                        break;

                    case 3:
                        Withdraw();
                        break;
                    
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        break;

                    default:
                        System.out.println("Invalid option. Please select a valid option.");
                }
            }
            while (Option != 4);
        }

        private void checkBalance() {
            System.out.println("Your current balance is: "+ account.getBalance());
        }

        private void Deposit() {
            System.out.println("Enter the amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        }

        private void Withdraw() {
            System.out.println("Enter the amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.Withdraw(amount);
    }
}

public class ATMinterface {
    public static void main(String[] args) {
        System.out.println("**Welcome to the ATM.**");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Four Digit Pin: ");
        int enteredPin = scanner.nextInt();

        BankAccount userAccount = new BankAccount(1000.0);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
