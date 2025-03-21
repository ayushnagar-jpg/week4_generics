package generics.resumescreeningsystem;


//Concrete Job Role: Data Scientist
public class DataScientist extends JobRole {
 String dataTool;

 public DataScientist(String candidateName, int experience, String dataTool) {
     super(candidateName, experience);
     this.dataTool = dataTool;
 }

 @Override
 void displayRoleDetails() {
     System.out.println("Data Scientist: " + candidateName + ", Experience: " + experience + 
                        " years, Tool: " + dataTool);
 }
}