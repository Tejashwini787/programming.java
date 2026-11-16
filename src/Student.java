public class Student {
    private String usn;
    private String name;
    private double[] marks = new double[3];
    private static int studentCount = 0;
    private static final double MAX_MARKS = 100.0;
    public Student(String usn, String name, double marks1, double marks2, double marks3) {
        this.usn = usn;
        this.name = name;
        this.marks[0] = validateMarks(marks1);
        this.marks[1] = validateMarks(marks2);
        this.marks[2] = validateMarks(marks3);
        studentCount++;
    }
    public String getUsn() {
        return usn;
    }
    public String getName() {
        return name;
    }
    public double[] getMarks() {
        return marks.clone();
    }
    public static int getStudentCount() {
        return studentCount;
    }
    private double validateMarks(double marksValue) {
        if (marksValue < 0 || marksValue > MAX_MARKS) {
            System.out.println("Warning: Invalid marks (" + marksValue + "). Setting to 0.0.");
            return 0.0;
        }
        return marksValue;
    }
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


    public void display() {
        System.out.println("--- Basic Details ---");
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }
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
    public ResultSummary getResultSummary() {
        return new ResultSummary(this.usn, calculateTotal(), calculateAverage());
    }
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
    public static void main(String[] args) {

        Student s1 = new Student("123", "Alice", 85, 90, 92);
        Student s2 = new Student("456", "Bob", 45, 105, 60); // 105 is invalid, will trigger validation fallback

        s1.display();
        System.out.println();
        s1.display(true);
        System.out.println();
        Student.ResultSummary summary = s1.getResultSummary();
        System.out.println(summary);
        System.out.println("\nTotal Students Created: " + Student.getStudentCount());
    }
}