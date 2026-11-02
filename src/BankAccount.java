// BankAccount.java
public class BankAccount {
    // Private fields for access control
    private final String accountIdentifier; // Final reference assigned during construction
    private double balance;

    // Static variable shared across all instances to count accounts
    private static int accountCount = 0;

    // Constructor
    public BankAccount(String accountIdentifier, double initialBalance) {
        this.accountIdentifier = accountIdentifier;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting to 0.0");
            this.balance = 0.0;
        }
        accountCount++; // Increment total account count
    }

    // Public getter for balance
    public double getBalance() {
        return this.balance;
    }

    // Public getter for account identifier
    public String getAccountIdentifier() {
        return this.accountIdentifier;
    }

    // Public static getter to access the account count
    public static int getAccountCount() {
        return accountCount;
    }

    // Deposit method with validation
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + this.balance);
    }

    // Withdraw method with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive.");
            return;
        }
        if (amount > this.balance) {
            System.out.println("Error: Insufficient funds. Current balance: $" + this.balance);
            return;
        }
        this.balance -= amount;
        System.out.println("Withdrew: $" + amount + " | New Balance: $" + this.balance);
    }
}
