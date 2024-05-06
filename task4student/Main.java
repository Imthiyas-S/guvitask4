package task4student;

public class Main {
    public static void main(String[] args) {
        try {
            
            Student student1 = new Student(1, "John Doe", 18, "Computer Science");
            student1.displayStudentDetails();

           
            Student student2 = new Student(2, "Jane Smith", 14, "Mathematics");
            student2.displayStudentDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            
            Student student3 = new Student(3, "Alice123", 19, "Physics");
            student3.displayStudentDetails();
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

