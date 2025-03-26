package regex.emailaddressextraction;
import java.util.regex.*;

public class EmailExtractor {
    public static void main(String[] args) {
        String text = "Contact us at support@example.com and info@company.org for more details.";

        // Define the email regex pattern
        String regex = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print all emails
        System.out.println("Extracted Emails:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
