package generics.coursemanagmentsystm;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType> {
    private List<T> courses;

    public Course() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(T course) {
        courses.add(course);
    }

    public void removeCourse(T course) {
        courses.remove(course);
    }

    public List<T> getCourses() {
        return courses;
    }

    public void displayCourses() {
        for (T course : courses) {
            System.out.println(course);
        }
    }
}
