package collections.Queue_Interface.HospitalTriageSystem;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // Create a PriorityQueue for patients (higher severity = higher priority)
        PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

        // Add patients
        triageQueue.add(new Patient("John", 3));
        triageQueue.add(new Patient("Alice", 5));
        triageQueue.add(new Patient("Bob", 2));

        System.out.println("Processing Patients in Order of Severity:");

        // Dequeue patients based on severity
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Process the highest severity first
        }
    }
}
