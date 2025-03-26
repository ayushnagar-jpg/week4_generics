package regex.usernamevalidation;
import java.util.regex.*;

public class UsernameValidator {
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        // ✅ Valid usernames
        System.out.println(isValidUsername("user_123"));  // true
        System.out.println(isValidUsername("JohnDoe12")); // true
        System.out.println(isValidUsername("Alice_99"));  // true

        // ❌ Invalid usernames
        System.out.println(isValidUsername("123user"));  // false (starts with number)
        System.out.println(isValidUsername("us"));       // false (too short)
        System.out.println(isValidUsername("user@name")); // false (contains '@')
        System.out.println(isValidUsername("very_long_username123")); // false (too long)
    }
}
