package generics.resumescreeningsystem;

import java.util.Arrays;
import java.util.List;

// Main Class for Testing
public class ResumeScreeningApp {
    public static void main(String[] args) {
        // Creating job role instances
        SoftwareEngineer se = new SoftwareEngineer("Alice", 5, "Java");
        DataScientist ds = new DataScientist("Bob", 3, "Python");
        ProductManager pm = new ProductManager("Charlie", 7, "E-commerce");

        // Generic Resume Processing
        Resume<SoftwareEngineer> seResume = new Resume<>(se);
        Resume<DataScientist> dsResume = new Resume<>(ds);
        Resume<ProductManager> pmResume = new Resume<>(pm);

        // Individual Processing
        seResume.processResume();
        dsResume.processResume();
        pmResume.processResume();

        // Processing Multiple Resumes with Wildcards
        List<JobRole> jobRoles = Arrays.asList(se, ds, pm);
        System.out.println("Batch Processing Resumes:");
        ResumeScreeningSystem.processMultipleResumes(jobRoles);
    }
}
