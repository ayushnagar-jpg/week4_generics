package generics.resumescreeningsystem;

//Concrete Job Role: Product Manager
public class ProductManager extends JobRole {
 String domainExpertise;

 public ProductManager(String candidateName, int experience, String domainExpertise) {
     super(candidateName, experience);
     this.domainExpertise = domainExpertise;
 }

 @Override
 void displayRoleDetails() {
     System.out.println("Product Manager: " + candidateName + ", Experience: " + experience + 
                        " years, Expertise: " + domainExpertise);
 }
}