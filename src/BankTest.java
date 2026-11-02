// BankTest.java
public class BankTest {
    public static void main(String[] args) {
        System.out.println("Initial Account Count: " + BankAccount.getAccountCount());

        // Create bank accounts
        BankAccount acc1 = new BankAccount("ACC-1001", 500.0);
        BankAccount acc2 = new BankAccount("ACC-1002", 1000.0);

        System.out.println("Total Accounts Created: " + BankAccount.getAccountCount());

        // Test normal operations
        System.out.println("\n--- Testing Standard Operations ---");
        acc1.deposit(200.0);
        acc1.withdraw(150.0);

        // Test validations
        System.out.println("\n--- Testing Validations ---");
        acc1.deposit(-50.0);     // Negative deposit
        acc1.withdraw(-20.0);    // Negative withdrawal
        acc1.withdraw(1000.0);   // Exceeding balance

        // Try accessing balance directly (Uncommenting the line below causes a compile error)
        // System.out.println(acc1.balance);
    }
}
