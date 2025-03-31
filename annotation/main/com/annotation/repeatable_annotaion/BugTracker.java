package annotation.repeatable_annotaion;

public class BugTracker {
	
    @BugReport(description = "NullPointerException when input is null")
    @BugReport(description = "ArrayIndexOutOfBounds when index is negative")
    public void buggyMethod() {
        System.out.println("Executing buggy method...");
    }
}
