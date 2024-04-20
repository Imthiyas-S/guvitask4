package task2amount;

public class Account {
  
    private double balance;

    
    public Account() {
       
        balance = 0.0;
    }

   
    public Account(double initialBalance) {
        
        balance = initialBalance;
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited Rs " + amount + " to the account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew Rs " + amount + " from the account.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    
    public void display() {
        System.out.println("Account balance: Rs " + balance);
    }

  
    public static void main(String[] args) {
        
        Account account1 = new Account();
        account1.display(); 
        
        account1.deposit(100);
        account1.display(); 
        account1.withdraw(50);
        account1.display(); 
        
        Account account2 = new Account(500);
        account2.display(); 
        
        account2.deposit(200);
        account2.display();
        account2.withdraw(600);
        account2.display(); 
    }
}
