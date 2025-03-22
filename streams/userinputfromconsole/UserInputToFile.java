package streams.userinputfromconsole;

import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        // Define file to store user data
    	String filePath = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\userinputfromconsole\\user_data.txt";

        
        // Try-with-resources to handle BufferedReader and FileWriter automatically
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(filePath, true)) { // Append mode
            
            // Prompt user for input
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());
            
            System.out.print("Enter your favorite programming language: ");
            String language = reader.readLine();
            
            // Write user input to file
            writer.write("Name: " + name + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Favorite Language: " + language + "\n");
            writer.write("-------------------------\n");
            
            System.out.println("Data successfully written to " + filePath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid age entered. Please enter a valid number.");
        }
    }
}
