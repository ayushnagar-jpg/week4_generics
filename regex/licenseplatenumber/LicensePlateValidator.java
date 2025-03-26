package regex.licenseplatenumber;
import java.util.regex.*;

public class LicensePlateValidator {
    public static boolean isValidLicensePlate(String plate) {
        String regex = "^[A-Z]{2}\\d{4}$";
        return Pattern.matches(regex, plate);
    }

    public static void main(String[] args) {
        // ✅ Valid license plates
        System.out.println(isValidLicensePlate("AB1234"));  // true
        System.out.println(isValidLicensePlate("XY9876"));  // true
        System.out.println(isValidLicensePlate("LM2023"));  // true

        // ❌ Invalid license plates
        System.out.println(isValidLicensePlate("A12345"));  // false (only one letter)
        System.out.println(isValidLicensePlate("abc123"));  // false (lowercase letters)
        System.out.println(isValidLicensePlate("ABC123"));  // false (three letters instead of two)
        System.out.println(isValidLicensePlate("AB123"));   // false (only three digits)
        System.out.println(isValidLicensePlate("AB12345")); // false (too many digits)
        System.out.println(isValidLicensePlate("12AB34"));  // false (wrong format)
    }
}
