package annotation.important_method;

public class ImportantTask {

    @ImportantMethod(level = "HIGH")
    public void criticalOperation() {
        System.out.println("Performing a critical operation...");
    }

    @ImportantMethod(level = "MEDIUM")
    public void secondaryOperation() {
        System.out.println("Performing a secondary operation...");
    }

    public void regularOperation() {
        System.out.println("Performing a regular operation...");
    }
}
