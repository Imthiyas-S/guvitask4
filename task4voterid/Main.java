package task4voterid;


public class Main {
 public static void main(String[] args) {
     try {
         Voter voter1 = new Voter(101, "Alice", 25);
         System.out.println("Voter 1: ID = " + voter1.getVoterId() + ", Name = " + voter1.getName() + ", Age = " + voter1.getAge());

         Voter voter2 = new Voter(102, "Bob", 17);
         System.out.println("Voter 2: ID = " + voter2.getVoterId() + ", Name = " + voter2.getName() + ", Age = " + voter2.getAge());
     } catch (InvalidVoterAgeException e) {

    	 System.out.println("Exception caught: " + e.getMessage());
     }

     try {
         Voter voter3 = new Voter(103, "Charlie", 16);
        
         System.out.println("Voter 3: ID = " + voter3.getVoterId() + ", Name = " + voter3.getName() + ", Age = " + voter3.getAge());
     } catch (InvalidVoterAgeException e) {

    	 System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
