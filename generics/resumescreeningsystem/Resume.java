package generics.resumescreeningsystem;


//Generic Class for Resume Processing
public class Resume<T extends JobRole> {
 private T jobRole;

 public Resume(T jobRole) {
     this.jobRole = jobRole;
 }

 public void processResume() {
     System.out.println("Processing Resume for:");
     jobRole.displayRoleDetails();
     System.out.println("---------------------------");
 }
}