import java.util.Scanner;

class students {
    String usn;
    String name;
    String branch;
    String phone;


    void readDetails(Scanner sc) {
        System.out.print("Enter USN: ");
        usn = sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Branch: ");
        branch = sc.nextLine();
        System.out.print("Enter Phone: ");
        phone = sc.nextLine();
    }


    void displayDetails() {
        System.out.printf("%-15s %-20s %-15s %-15s\n", usn, name, branch, phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students (N): ");
        int n = sc.nextInt();
        sc.nextLine();


        students[] student = new students[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            student[i] = new students();
            student[i].readDetails(sc);
        }


        System.out.println("\n-------------------------------------------------------------------");
        System.out.printf("%-15s %-20s %-15s %-15s\n", "USN", "Name", "Branch", "Phone");
        System.out.println("-------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            student[i].displayDetails();
        }

        sc.close();
    }
}
