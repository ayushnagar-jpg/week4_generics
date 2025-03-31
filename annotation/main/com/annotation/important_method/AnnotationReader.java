package annotation.important_method;

import java.lang.reflect.Method;

public class AnnotationReader {

    public static void main(String[] args) {
        try {
            // Get all methods from the ImportantTask class
            Method[] methods = ImportantTask.class.getDeclaredMethods();

            System.out.println("Annotated Important Methods:");
            for (Method method : methods) {
                if (method.isAnnotationPresent(ImportantMethod.class)) {
                    ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                    System.out.println("Method: " + method.getName() + ", Importance Level: " + annotation.level());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

