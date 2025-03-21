package generics.coursemanagmentsystm;


public class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String instructor, String researchTopic) {
        super(courseName, instructor);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    @Override
    public String toString() {
        return super.toString() + ", Research Topic: " + researchTopic;
    }
}
