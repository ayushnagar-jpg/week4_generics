package annotation.repeatable_annotaion;

import java.lang.reflect.Method;

public class BugReportReader {

    public static void main(String[] args) {
        try {
            Method method = BugTracker.class.getMethod("buggyMethod");

            // Check for the presence of the container annotation
            if (method.isAnnotationPresent(BugReports.class)) {
                // Get the container annotation (BugReports)
                BugReports bugReports = method.getAnnotation(BugReports.class);
                for (BugReport bugReport : bugReports.value()) {
                    System.out.println("Bug: " + bugReport.description());
                }
            } else {
                System.out.println("No bug reports found.");
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

