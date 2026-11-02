public class Student {
    // Private fields
    private String usn;
    private String name;
    private double[] marks = new double[3];

    // Static variable to count the number of students created
    private static int studentCount = 0;

    // Final variable for maximum permitted marks per subject
    private static final double MAX_MARKS = 100.0;

    // Constructor to initialize student data
    public Student(String usn, String name, double marks1, double marks2, double marks3) {
        this.usn = usn;
        this.name = name;

        // Protect and validate marks during initialization
        this.marks[0] = validateMarks(marks1);
        this.marks[1] = validateMarks(marks2);
        this.marks[2] = validateMarks(marks3);

        // Increment static student counter
        studentCount++;
    }

    // Getter methods
    public String getUsn() {
        return usn;
    }

    public String getName() {
        return name;
    }

    public double[] getMarks() {
        return marks.clone(); // Returns a copy to preserve encapsulation
    }

    public static int getStudentCount() {
        return studentCount;
    }

    // Validation method to protect the marks
    private double validateMarks(double marksValue) {
        if (marksValue < 0 || marksValue > MAX_MARKS) {
            System.out.println("Warning: Invalid marks (" + marksValue + "). Setting to 0.0.");
            return 0.0;
        }
        return marksValue;
    }

    // Method to calculate total and average
    public double calculateTotal() {
        double total = 0;
        for (double m : marks) {
            total += m;
        }
        return total;
    }

    public double calculateAverage() {
        return calculateTotal() / marks.length;
    }

    // Overloaded display() method - Prints basic details
    public void display() {
        System.out.println("--- Basic Details ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    // Overloaded display() method - Prints the result
    public void display(boolean showResult) {
        if (showResult) {
            System.out.println("--- Result Details ---");
            System.out.println("USN: " + usn);
            System.out.println("Name: " + name);
            System.out.println("Marks: [" + marks[0] + ", " + marks[1] + ", " + marks[2] + "]");
            System.out.println("Total Marks: " + calculateTotal());
            System.out.printf("Average Marks: %.2f\n", calculateAverage());
        } else {
            display();
        }
    }

    // Return a new object containing a student's result summary
    public ResultSummary getResultSummary() {
        return new ResultSummary(this.usn, calculateTotal(), calculateAverage());
    }

    // Helper class to hold the result summary
    public static class ResultSummary {
        private String usn;
        private double total;
        private double average;

        public ResultSummary(String usn, double total, double average) {
            this.usn = usn;
            this.total = total;
            this.average = average;
        }

        @Override
        public String toString() {
            return "ResultSummary [USN=" + usn + ", Total=" + total + ", Average=" + String.format("%.2f", average) + "]";
        }
    }

    // Main method to test the class functionality directly
    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student("123", "Alice", 85, 90, 92);
        Student s2 = new Student("456", "Bob", 45, 105, 60); // 105 is invalid, will trigger validation fallback

        // Testing overloaded display methods
        s1.display();
        System.out.println();
        s1.display(true);
        System.out.println();

        // Testing result summary extraction
        Student.ResultSummary summary = s1.getResultSummary();
        System.out.println(summary);

        // Display total students tracked by the static variable
        System.out.println("\nTotal Students Created: " + Student.getStudentCount());
    }
}