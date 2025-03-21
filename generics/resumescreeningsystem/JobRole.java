package generics.resumescreeningsystem;

//Abstract Class for Job Role
public abstract class JobRole {
 String candidateName;
 int experience; // in years

 public JobRole(String candidateName, int experience) {
     this.candidateName = candidateName;
     this.experience = experience;
 }

 abstract void displayRoleDetails();
}