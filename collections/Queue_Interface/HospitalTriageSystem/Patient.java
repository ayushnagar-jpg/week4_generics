package collections.Queue_Interface.HospitalTriageSystem;

public class Patient implements Comparable<Patient> {
    private String name;
    private int severity; // Higher value = higher priority

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public int getSeverity() {
        return severity;
    }

    // Custom sorting: Higher severity patients first
    @Override
    public int compareTo(Patient other) {
        return Integer.compare(other.severity, this.severity); // Descending order
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}
