import java.util.*;

// Base class for the bank account
class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: Rs " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: Rs " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

// Derived class for the ATM machine
class ATM extends BankAccount {
    public ATM(double initialBalance) {
        super(initialBalance);
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                	System.out.println("Your current balance is: Rs " + getBalance());
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);

        scanner.close();
    }

    // Main method to run the ATM interface
    public static void main(String[] args) {
        // Create an ATM object with an initial balance
        ATM atm = new ATM(1000.0);

        // Show the ATM menu
        atm.showMenu();
    }
}

