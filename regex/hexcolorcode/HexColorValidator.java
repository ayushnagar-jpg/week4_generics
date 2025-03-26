package regex.hexcolorcode;
import java.util.regex.*;

public class HexColorValidator {
    public static boolean isValidHexColor(String color) {
        String regex = "^#([A-Fa-f0-9]{6})$";
        return Pattern.matches(regex, color);
    }

    public static void main(String[] args) {
        // ✅ Valid hex color codes
        System.out.println(isValidHexColor("#FFA500"));  // true
        System.out.println(isValidHexColor("#ff4500"));  // true
        System.out.println(isValidHexColor("#1A2B3C"));  // true
        System.out.println(isValidHexColor("#abcdef"));  // true

        // ❌ Invalid hex color codes
        System.out.println(isValidHexColor("FFA500"));   // false (missing #)
        System.out.println(isValidHexColor("#123"));     // false (too short)
        System.out.println(isValidHexColor("#GGGGGG"));  // false (invalid hex characters)
        System.out.println(isValidHexColor("#AABBCCDD"));// false (too long)
        System.out.println(isValidHexColor("#12G45Z"));  // false (invalid characters)
    }
}
