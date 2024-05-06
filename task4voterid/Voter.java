package task4voterid;



public class Voter {
 private int voterId;
 private String name;
 private int age;


 public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
 
     if (age < 18) {
       
         throw new InvalidVoterAgeException("Invalid age for voter");
     }
     
     this.voterId = voterId;
     this.name = name;
     this.age = age;
 }


 public int getVoterId() {
     return voterId;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 
}
