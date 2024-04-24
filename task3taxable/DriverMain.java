package task3taxable;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter yearly salary: ");
        double salary = scanner.nextDouble();


        Employee employee = new Employee(empId, name, salary);
        double incomeTaxAmount = employee.calcTax();
        System.out.println("Income tax on yearly salary: Rs " + incomeTaxAmount);

      
        System.out.print("\nEnter product ID: ");
        int pid = scanner.nextInt();

        System.out.print("Enter unit price of product: ");
        double price = scanner.nextDouble();

        System.out.print("Enter quantity of product: ");
        int quantity = scanner.nextInt();

     
        Product product = new Product(pid, price, quantity);
        double salesTaxAmount = product.calcTax();
        System.out.println("Sales tax on unit price of product: Rs " + salesTaxAmount);


        scanner.close();
    }
}
