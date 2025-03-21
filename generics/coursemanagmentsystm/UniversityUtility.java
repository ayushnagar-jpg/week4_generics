package generics.coursemanagmentsystm;

import java.util.List;

public class UniversityUtility {
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course);
        }
    }
}
