
public class BankAccount {

    private final String accountIdentifier;
    private double balance;


    private static int accountCount = 0;


    public BankAccount(String accountIdentifier, double initialBalance) {
        this.accountIdentifier = accountIdentifier;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting to 0.0");
            this.balance = 0.0;
        }
        accountCount++;
    }


    public double getBalance() {
        return this.balance;
    }


    public String getAccountIdentifier() {
        return this.accountIdentifier;
    }


    public static int getAccountCount() {
        return accountCount;
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive.");
            return;
        }
        this.balance += amount;
        System.out.println("Deposited: $" + amount + " | New Balance: $" + this.balance);
    }


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
