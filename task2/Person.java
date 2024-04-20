package task2;

public class Person {
   
    private String name;
    private int age;

    
    private static final int DEFAULT_AGE = 18;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public Person(String name) {
        this.name = name;
        this.age = DEFAULT_AGE;
    }

   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    
    public static void main(String[] args) {
        
        Person person1 = new Person("John", 25);
        person1.displayInfo(); 

        
        Person person2 = new Person("Jane");
        person2.displayInfo();
    }
}
