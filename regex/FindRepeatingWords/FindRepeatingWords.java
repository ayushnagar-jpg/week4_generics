package regex.FindRepeatingWords;
import java.util.regex.*;
import java.util.*;

public class FindRepeatingWords {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b\\s+\\b\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> duplicates = new HashSet<>();
        while (matcher.find()) {
            duplicates.add(matcher.group(1));
        }

        System.out.println("Repeated Words: " + duplicates);
    }
}
