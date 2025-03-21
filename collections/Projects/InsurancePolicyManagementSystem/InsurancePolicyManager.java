package collections.Projects.InsurancePolicyManagementSystem;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class InsurancePolicyManager {
    private Map<String, Policy> policyMap = new HashMap<>(); // Quick lookup by policy number
    private Map<String, Policy> orderedPolicyMap = new LinkedHashMap<>(); // Maintains insertion order
    private Map<LocalDate, Policy> sortedPolicyMap = new TreeMap<>(); // Sorted by expiry date

    // Add a policy
    public void addPolicy(Policy policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        orderedPolicyMap.put(policy.getPolicyNumber(), policy);
        sortedPolicyMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by number
    public Policy getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        LocalDate today = LocalDate.now();
        for (Map.Entry<LocalDate, Policy> entry : sortedPolicyMap.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= 30) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyholder) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : policyMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholder)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();
        Iterator<LocalDate> iterator = sortedPolicyMap.keySet().iterator();
        while (iterator.hasNext()) {
            LocalDate expiryDate = iterator.next();
            if (expiryDate.isBefore(today)) {
                Policy expiredPolicy = sortedPolicyMap.get(expiryDate);
                policyMap.remove(expiredPolicy.getPolicyNumber());
                orderedPolicyMap.remove(expiredPolicy.getPolicyNumber());
                iterator.remove();
            }
        }
    }

    // Display all policies
    public void displayAllPolicies() {
        for (Policy policy : orderedPolicyMap.values()) {
            System.out.println(policy);
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManager manager = new InsurancePolicyManager();

        // Adding sample policies
        manager.addPolicy(new Policy("P123", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P124", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P125", "Alice", LocalDate.now().minusDays(5)));
        manager.addPolicy(new Policy("P126", "Charlie", LocalDate.now().plusDays(20)));

        // Retrieve policy by number
        System.out.println("Policy P123: " + manager.getPolicyByNumber("P123"));

        // Policies expiring within 30 days
        System.out.println("Expiring Policies: " + manager.getExpiringPolicies());

        // Policies by policyholder
        System.out.println("Alice's Policies: " + manager.getPoliciesByHolder("Alice"));

        // Remove expired policies
        manager.removeExpiredPolicies();
        System.out.println("All policies after removing expired ones:");
        manager.displayAllPolicies();
    }
}
