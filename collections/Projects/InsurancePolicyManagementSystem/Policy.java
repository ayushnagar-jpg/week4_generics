package collections.Projects.InsurancePolicyManagementSystem;


import java.time.LocalDate;

public class Policy {
    private String policyNumber;
    private String policyholderName;
    private LocalDate expiryDate;

    public Policy(String policyNumber, String policyholderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Policy{" +
               "policyNumber='" + policyNumber + '\'' +
               ", policyholderName='" + policyholderName + '\'' +
               ", expiryDate=" + expiryDate +
               '}';
    }
}

