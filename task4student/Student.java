package task4student;

public class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
       
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21");
        }


        if (!isNameValid(name)) {
            throw new NameNotValidException("Name must not contain numbers or special symbols");
        }

        
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    
    private boolean isNameValid(String name) {
      
        return name.matches("[a-zA-Z ]+");
    }

    

    
    public void displayStudentDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
