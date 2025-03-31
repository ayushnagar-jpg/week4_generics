package annotation.logging_method;

public class SampleTasks {

    @LogExecutionTime
    public void fastMethod() {
        for (int i = 0; i < 1000; i++) {
            int result = i * i;
        }
        System.out.println("Fast method executed.");
    }

    @LogExecutionTime
    public void slowMethod() {
        for (int i = 0; i < 1000000; i++) {
            int result = i * i;
        }
        System.out.println("Slow method executed.");
    }

    public void noLogMethod() {
        System.out.println("Method without logging.");
    }
}

