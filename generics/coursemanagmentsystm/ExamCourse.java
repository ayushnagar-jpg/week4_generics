package generics.coursemanagmentsystm;

public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String courseName, String instructor, int totalMarks) {
        super(courseName, instructor);
        this.totalMarks = totalMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    @Override
    public String toString() {
        return super.toString() + ", Total Marks: " + totalMarks;
    }
}
