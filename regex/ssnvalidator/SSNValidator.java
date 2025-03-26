package regex.ssnvalidator;
public class SSNValidator {
    public static boolean isValidSSN(String ssn) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        return ssn.matches(regex);
    }

    public static void main(String[] args) {
        System.out.println(isValidSSN("123-45-6789")); // ✅ true
        System.out.println(isValidSSN("123456789"));   // ❌ false
    }
}
