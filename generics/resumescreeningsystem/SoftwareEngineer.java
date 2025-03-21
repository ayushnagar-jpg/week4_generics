package generics.resumescreeningsystem;

//Concrete Job Role: Software Engineer
//dfdg
public class SoftwareEngineer extends JobRole {
 String programmingLanguage;

 public SoftwareEngineer(String candidateName, int experience, String programmingLanguage) {
     super(candidateName, experience);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 void displayRoleDetails() {
     System.out.println("Software Engineer: " + candidateName + ", Experience: " + experience + 
                        " years, Tech: " + programmingLanguage);
 }
}