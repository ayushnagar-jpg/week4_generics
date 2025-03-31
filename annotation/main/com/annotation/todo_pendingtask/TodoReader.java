package annotation.todo_pendingtask;

import java.lang.reflect.Method;

public class TodoReader {

    public static void main(String[] args) {
        try {
            // Get all methods from the PendingTasks class
            Method[] methods = PendingTask.class.getDeclaredMethods();

            System.out.println("Pending Tasks:");
            for (Method method : methods) {
                if (method.isAnnotationPresent(Todo.class)) {
                    Todo todo = method.getAnnotation(Todo.class);
                    System.out.println("Method: " + method.getName());
                    System.out.println("Task: " + todo.task());
                    System.out.println("Assigned To: " + todo.assignedTo());
                    System.out.println("Priority: " + todo.priority());
                    System.out.println("------------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
