package regex.capitalizedwordextraction;
import java.util.regex.*;
import java.util.*;

public class CapitalizedWordsExtractor {
    public static void main(String[] args) {
        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

        // Define the regex pattern
        String regex = "\\b[A-Z][a-z]*\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print capitalized words
        List<String> capitalizedWords = new ArrayList<>();
        while (matcher.find()) {
            capitalizedWords.add(matcher.group());
        }

        System.out.println("Extracted Capitalized Words: " + String.join(", ", capitalizedWords));
    }
}
