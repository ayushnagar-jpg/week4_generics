package exception_handling.exceptionpropagationinmethods;

public class ExceptionPropagation {
    
    // Method that throws an exception
    public static void method1() {
        System.out.println("Inside method1");
        int result = 10 / 0; // ArithmeticException (division by zero)
    }

    // Method that calls method1()
    public static void method2() {
        System.out.println("Inside method2");
        method1(); // Exception propagates here
    }

    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } 
        catch (ArithmeticException e) {
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}
