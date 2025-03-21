package generics.coursemanagmentsystm;

public abstract class CourseType {
    private String courseName;
    private String instructor;

    public CourseType(String courseName, String instructor) {
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - Course: " + courseName + ", Instructor: " + instructor;
    }
}
