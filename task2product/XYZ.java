package task2product;

import java.util.Scanner;

public class XYZ {
 
    public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        Product[] products = new Product[5];

      
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID: ");
            int pid = scanner.nextInt();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

        
            products[i] = new Product(pid, price, quantity);
        }

     
        int highestPricePid = products[0].getPid();
        double highestPrice = products[0].getPrice();
        for (Product product : products) {
            if (product.getPrice() > highestPrice) {
                highestPrice = product.getPrice();
                highestPricePid = product.getPid();
            }
        }

       
        System.out.println("Product ID of the product with the highest price: " + highestPricePid);

      
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: Rs" + totalAmount);

        scanner.close();
    }
}
