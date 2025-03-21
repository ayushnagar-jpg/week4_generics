package generics.coursemanagmentsystm;

public class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String courseName, String instructor, int totalAssignments) {
        super(courseName, instructor);
        this.totalAssignments = totalAssignments;
    }

    public int getTotalAssignments() {
        return totalAssignments;
    }

    @Override
    public String toString() {
        return super.toString() + ", Total Assignments: " + totalAssignments;
    }
}
