
import java.util.ArrayList;
import java.util.List;


class Person {

    private String name;
    private int age;


    private static int totalPeopleCount = 0;


    public static final String INSTITUTION_NAME = "Global Tech University";


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        totalPeopleCount++; // Increment static counter
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getTotalPeopleCount() {
        return totalPeopleCount;
    }


    public void displayDetails() {
        System.out.println("Institution: " + INSTITUTION_NAME);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    public void displayDetails(boolean includeHeader) {
        if (includeHeader) {
            System.out.println("--- PERSON PROFILE ---");
        }
        displayDetails();
    }
}


class student extends Person {
    private String studentId;
    private String major;

    public student(String name, int age, String studentId, String major) {
        super(name, age); // Invoking parent constructor
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // Reusing parent logic
        System.out.println("Role: Student");
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}


class Faculty extends Person {
    private String ployeeId;
    private Department dpartment; // Composition with nested class


    public static class Department {
        private String deptName;
        private String blockCode;

        public Department(String deptName, String blockCode) {
            this.deptName = deptName;
            this.blockCode = blockCode;
        }

        @Override
        public String toString() {
            return deptName + " (Block: " + blockCode + ")";
        }
    }

    public Faculty(String name, int age, String employeeId, Department department) {
        super(name, age);
        this.ployeeId = employeeId;
        this.dpartment = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Faculty");
        System.out.println("Employee ID: " + ployeeId);
        System.out.println("Department: " + dpartment);
    }
}


class Administrator extends Person {
    private String roleTitle;

    public Administrator(String name, int age, String roleTitle) {
        super(name, age);
        this.roleTitle = roleTitle;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Administrator");
        System.out.println("Title: " + roleTitle);
    }
}


public class Mine {
    public static void main(String[] args) {

        Faculty.Department csDept = new Faculty.Department("Computer Science", "Tech-B");


        Person[] directory = new Person[3];
        directory[0] = new student("Alice Johnson", 20, "S101", "Data Science");
        directory[1] = new Faculty("Dr. Robert Smith", 45, "F204", csDept);
        directory[2] = new Administrator("Claire Danes", 38, "Registrar");

        System.out.println("=========================================");
        System.out.println("DEMONSTRATING RUN-TIME POLYMORPHISM");
        System.out.println("=========================================\n");


        for (Person Person : directory) {
            Person.displayDetails();
            System.out.println("-----------------------------------------");
        }

        System.out.println("\n=========================================");
        System.out.println("DEMONSTRATING OVERLOADED METHOD");
        System.out.println("=========================================");
        directory[0].displayDetails(true);

        System.out.println("\n=========================================");
        System.out.println("METADATA STATS");
        System.out.println("=========================================");
        System.out.println("Total Person Instances Created: " + Person.getTotalPeopleCount());
    }
}
