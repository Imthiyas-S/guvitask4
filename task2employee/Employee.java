package task2employee;

public class Employee extends Person {
    
    private int employeeID;
    private double salary;

    public Employee(String name, int age, int employeeID, double salary) {
        
        super(name, age);
     
        this.employeeID = employeeID;
        this.salary = salary;
    }

   
    public void display() {
      
        super.display();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: Rs " + salary);
    }
}
