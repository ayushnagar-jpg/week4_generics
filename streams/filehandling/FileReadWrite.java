package streams.filehandling;

import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        // Source and destination file paths
    	String sourceFile = "C:/Users/hp/Desktop/week4_generics/generics/src/streams/filehandling/source.txt";

    	String destinationFile = "C:/Users/hp/Desktop/week4_generics/generics/src/streams/filehandling/destination.txt";


        // FileInputStream and FileOutputStream for reading and writing files
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully!");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}
