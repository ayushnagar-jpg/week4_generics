package exception_handling.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        String fileName = "info.txt"; // Change path if needed

        // Using try-with-resources to ensure automatic resource closure
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String firstLine = br.readLine();
            if (firstLine != null) {
                System.out.println("First line: " + firstLine);
            } else {
                System.out.println("File is empty.");
            }
        } 
        catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
