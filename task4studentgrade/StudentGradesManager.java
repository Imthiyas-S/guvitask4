package task4studentgrade;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesManager {

   
    private HashMap<String, Integer> studentGrades;

   
    public StudentGradesManager() {
        studentGrades = new HashMap<>();
    }


    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade + ".");
    }

   
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

   
    public void displayGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade for student " + name + " is " + grade + ".");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

  
    public static void main(String[] args) {
       
        StudentGradesManager manager = new StudentGradesManager();
       
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Display a student's grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    manager.addStudent(name, grade);
                    break;

                case 2:
                    
                    System.out.print("Enter student name: ");
                    String studentNameToRemove = scanner.nextLine();
                    manager.removeStudent(studentNameToRemove);
                    break;

                case 3:
                   
                    System.out.print("Enter student name: ");
                    String studentNameToDisplay = scanner.nextLine();
                    manager.displayGrade(studentNameToDisplay);
                    break;

                case 4:
                  
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}
