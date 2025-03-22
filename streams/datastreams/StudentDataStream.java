package streams.datastreams;

import java.io.*;

public class StudentDataStream {
    private static final String FILE_PATH = "C:\\Users\\hp\\Desktop\\week4_generics\\generics\\src\\streams\\datastreams\\students.dat";

    public static void main(String[] args) {
        // Write student details to the file
        writeStudentData();

        // Read and display student details from the file
        readStudentData();
    }

    // Method to write student details
    public static void writeStudentData() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH))) {
            // Writing 3 students as an example
            dos.writeInt(101);  // Roll Number
            dos.writeUTF("Alice"); // Name
            dos.writeDouble(3.9); // GPA
            
            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.8);
            
            System.out.println("Student data successfully written to file.");
        } catch (IOException e) {
            System.out.println("Error writing student data: " + e.getMessage());
        }
    }

    // Method to read student details
    public static void readStudentData() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_PATH))) {
            System.out.println("\nReading student data from file:");
            while (dis.available() > 0) {
                int rollNumber = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }
}
