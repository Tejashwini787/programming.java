
class mployee {
    int id;
    String name;
    double basicSalary;


    public mployee(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
    }
}


class PermanentEmployee extends mployee {
    double allowance;
    double bonus;

    public PermanentEmployee(int id, String name, double basicSalary, double allowance, double bonus) {
        super(id, name, basicSalary); // Invoking parent constructor
        this.allowance = allowance;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + allowance + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Permanent Employee");
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("-----------------------------------");
    }
}


class ContractEmployee extends mployee {
    int hoursWorked;
    double hourlyRate;

    public ContractEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0); // Basic salary is 0 since payment is hourly-based
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        // Overriding the display to show hourly metrics instead of standard basic salary
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Type: Contract Employee");
        System.out.println("Hours Worked: " + hoursWorked + " | Hourly Rate: $" + hourlyRate);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("-----------------------------------");
    }
}


public class employmain {
    public static void main(String[] args) {

        mployee[] employees = new mployee[2];

        employees[0] = new PermanentEmployee(101, "Alice Smith", 5000.0, 800.0, 500.0);
        employees[1] = new ContractEmployee(102, "Bob Jones", 120, 45.0);


        System.out.println("--- Employee Payroll Details ---\n");
        for (mployee emp : employees) {
            emp.displayDetails();
        }
    }
}
