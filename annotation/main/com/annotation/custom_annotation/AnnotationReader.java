package annotation.custom_annotation;

import java.lang.reflect.Method;

public class AnnotationReader {

    public static void main(String[] args) {
        try {
            
            Method[] methods = TaskManager.class.getDeclaredMethods();

            for (Method method : methods) {
                // Check if the method has the TaskInfo annotation
                if (method.isAnnotationPresent(TaskInfo.class)) {
                    // Get the annotation instance
                    TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                    // Print the annotation details
                    System.out.println("Method: " + method.getName());
                    System.out.println("Priority: " + taskInfo.priority());
                    System.out.println("Assigned To: " + taskInfo.assignTo());
                    System.out.println("----------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
