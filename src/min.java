// Base class representing a Person
class Person {
    protected String name;

    // Constructor for Person
    public Person(String name) {
        this.name = name;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
    }
}

// Subclass extending Person to represent an Employee
class Employee extends Person {
    protected int employeeId;

    // Constructor for Employee passing name to the superclass
    public Employee(String name, int employeeId) {
        super(name);
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

// Subclass extending Employee to represent a Manager
class Manager extends Employee {
    private String department;

    // Constructor for Manager passing name and id up the chain
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    // Method to display manager details
    public void displayManager() {
        System.out.println("Department: " + department);
    }
}

// Main class to execute the code snippet
public class min {
    public static void main(String[] args) {

        // Creating the Manager object exactly as shown in the image
        Manager m = new Manager(
                "Priya",
                101,
                "IT"
        );

        // Method calls from the image
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}
