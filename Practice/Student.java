public class Student {
    private String studentName;
    private int rollNumber;
    private double marks;

    // Constructor
    public Student(String name, int rollNumber, double marks) {
        this.studentName = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        // Create an array of ten Student objects
        Student[] students = new Student[10];

        // Populate the array with student data
        students[0] = new Student("Alice", 101, 85.5);
        students[1] = new Student("Bob", 102, 78.0);
        students[2] = new Student("Charlie", 103, 92.5);
        // Add more students as needed...

        // Find the student with the highest marks
        Student highestScorer = findHighestScorer(students);

        // Display the details of the student with the highest marks
        if (highestScorer != null) {
            System.out.println("Student with the highest marks:");
            System.out.println("Name: " + highestScorer.getStudentName());
            System.out.println("Roll Number: " + highestScorer.getRollNumber());
            System.out.println("Marks: " + highestScorer.getMarks());
        } else {
            System.out.println("No students in the array.");
        }
    }

    // Method to find the student with the highest marks
    private static Student findHighestScorer(Student[] students) {
        if (students == null || students.length == 0) {
            return null;
        }

        Student highestScorer = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getMarks() > highestScorer.getMarks()) {
                highestScorer = students[i];
            }
        }

        return highestScorer ;
    }
}