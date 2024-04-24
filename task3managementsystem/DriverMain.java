package task3managementsystem;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                 
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter Publication Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); 

                    Book book = new Book(id, title, author, year);
                    library.addBook(book);
                    break;
                case 2:
                    
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine(); 
                    library.removeBook(removeId);
                    break;
                case 3:
                 
                    System.out.print("Enter Book ID to search: ");
                    int searchId = scanner.nextInt();
                    scanner.nextLine(); 

                    Book foundBook = library.searchBook(searchId);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book with ID " + searchId + " not found.");
                    }
                    break;
                case 4:
                   
                    library.displayBooks();
                    break;
                case 5:
                  
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
