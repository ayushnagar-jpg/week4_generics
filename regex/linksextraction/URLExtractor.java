package regex.linksextraction;
import java.util.regex.*;
import java.util.*;

public class URLExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Define the regex pattern for URLs
        String regex = "https?://[a-zA-Z0-9.-]+(\\.[a-zA-Z]{2,})+(/\\S*)?";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print URLs
        List<String> urls = new ArrayList<>();
        while (matcher.find()) {
            urls.add(matcher.group());
        }

        System.out.println("Extracted URLs: " + String.join(", ", urls));
    }
}
