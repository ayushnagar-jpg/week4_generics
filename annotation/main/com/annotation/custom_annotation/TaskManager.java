package annotation.custom_annotation;


public class TaskManager {

    @TaskInfo(priority = "High", assignTo = "Alice")
    public void completeTask() {
        System.out.println("Task completed successfully.");
    }

    @TaskInfo(priority = "Low", assignTo = "Bob")
    public void scheduleTask() {
        System.out.println("Task scheduled for later.");
    }
}
