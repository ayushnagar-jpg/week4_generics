package collections.Queue_Interface.Binary_Number;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 5; // Number of binary numbers to generate

        // Generate binary numbers using the queue
        List<String> binaryNumbers = BinaryGenerator.generateBinaryNumbers(N);

        // Print result
        System.out.println("First " + N + " binary numbers: " + binaryNumbers);
    }
}
