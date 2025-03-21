package generics.coursemanagmentsystm;
//Main
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating different course categories
        Course<ExamCourse> examCourseList = new Course<>();
        examCourseList.addCourse(new ExamCourse("Data Structures", "Dr. Smith", 100));
        examCourseList.addCourse(new ExamCourse("Operating Systems", "Dr. Brown", 80));

        Course<AssignmentCourse> assignmentCourseList = new Course<>();
        assignmentCourseList.addCourse(new AssignmentCourse("Software Engineering", "Prof. Johnson", 5));
        assignmentCourseList.addCourse(new AssignmentCourse("Database Management", "Dr. Miller", 4));

        Course<ResearchCourse> researchCourseList = new Course<>();
        researchCourseList.addCourse(new ResearchCourse("Artificial Intelligence", "Dr. Taylor", "Machine Learning Models"));
        researchCourseList.addCourse(new ResearchCourse("Cyber Security", "Prof. Wilson", "Network Intrusion Detection"));

        // Displaying Courses Individually
        System.out.println("Exam-Based Courses:");
        examCourseList.displayCourses();

        System.out.println("\nAssignment-Based Courses:");
        assignmentCourseList.displayCourses();

        System.out.println("\nResearch-Based Courses:");
        researchCourseList.displayCourses();

        // Using Wildcard to Display All Courses
        System.out.println("\nDisplaying All Courses:");
        UniversityUtility.displayAllCourses(examCourseList.getCourses());
        UniversityUtility.displayAllCourses(assignmentCourseList.getCourses());
        UniversityUtility.displayAllCourses(researchCourseList.getCourses());
    }
}
