package task4weekdays;

import java.util.Scanner;

public class WeekdaysProgram {

    public static void main(String[] args) {
        
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
    
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();
        
        try {
            
            String dayName = weekdays[dayPosition];
           
            System.out.println("The day at position " + dayPosition + " is " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid position! Please enter a number between 0 and 6.");
        }

        
        scanner.close();
    }
}
