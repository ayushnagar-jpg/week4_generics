package exception_handling.checkedexception;

import java.io.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
String fileName = "C:\\Users\\hp\\Desktop\\JAVA\\week4_generics\\generics\\src\\exception_handling\\checkedexception\\data.txt";


        try {
            // Create FileReader and BufferedReader
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("File contents:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}
