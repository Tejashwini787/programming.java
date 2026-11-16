
class University {
    private String uniName = "Global Tech University";


    static class Department {
        private String deptName;

        public Department(String deptName) {
            this.deptName = deptName;
        }

        public void displayDepartment() {
            System.out.println("Department Name: " + deptName);
        }
    }

    // 2. Non-static inner class
    class Faculty {
        private String facultyName;
        private String designation;

        public Faculty(String facultyName, String designation) {
            this.facultyName = facultyName;
            this.designation = designation;
        }

        public void displayFaculty() {
            System.out.println("Faculty Name: " + facultyName + ", Designation: " + designation);
        }
    }


    public void displayUniversityInfo() {
        System.out.println("University Name: " + uniName);
    }
}

public class universitymain {
    public static void main(String[] args) {

        University myUni = new University();


        University.Department myDept = new University.Department("Computer Science");


        University.Faculty myFaculty = myUni.new Faculty("Dr. Smith", "Professor");


        System.out.println("--- University Details ---");
        myUni.displayUniversityInfo();
        myDept.displayDepartment();
        myFaculty.displayFaculty();
    }
}
