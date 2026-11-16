
class person {
    String name;
    int age;


    person(String name, int age) {
        System.out.println("Person constructor called");
        this.name = name;
        this.age = age;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class employee extends person {
    String employeeId;
    double basicSalary;

    // Parameterized constructor using super()
    employee(String name, int age, String employeeId, double basicSalary) {
        super(name, age); // Invoking parent constructor
        System.out.println("Employee constructor called");
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }


    @Override
    void display() {
        super.display();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: $" + basicSalary);
    }
}


class manager extends employee {
    String department;
    double bonus;


    manager(String name, int age, String employeeId, double basicSalary, String department, double bonus) {
        super(name, age, employeeId, basicSalary); // Invoking parent constructor
        System.out.println("Manager constructor called");
        this.department = department;
        this.bonus = bonus;
    }


    double calculateTotalSalary() {
        return basicSalary + bonus;
    }


    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }
}


public class Personmain {
    public static void main(String[] args) {
        System.out.println("--- Creating a Manager Object ---");
        // Creating an instance of Manager to demonstrate constructor execution order
        manager mgr = new manager("Alice Smith", 35, "M104", 75000.0, "IT Engineering", 12500.0);

        System.out.println("\n--- Displaying Manager Details ---");
        mgr.display();
    }
}
