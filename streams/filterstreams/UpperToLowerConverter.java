package streams.filterstreams;

import java.io.*;

public class UpperToLowerConverter {
    public static void main(String[] args) {
        // Define file paths
    	  String sourceFile = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\filterstreams\\source.txt";
          String destinationFile = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\filterstreams\\destination.txt";

        // Try-with-resources for automatic resource management
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase()); // Convert to lowercase
                writer.newLine(); // Write a new line
            }
            
            System.out.println("Conversion complete. Data written to " + destinationFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
