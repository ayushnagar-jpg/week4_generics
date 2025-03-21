package generics.resumescreeningsystem;


import java.util.List;

// AI Screening System f
public class ResumeScreeningSystem {
    // Wildcard method to process multiple job roles
    public static void processMultipleResumes(List<? extends JobRole> resumes) {
        for (JobRole job : resumes) {
            job.displayRoleDetails();
        }
    }
}