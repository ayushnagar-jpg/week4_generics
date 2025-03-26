package regex.extractdateformat;
import java.util.regex.*;
import java.util.*;

public class DateExtractor {
    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Define the regex pattern
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract and print dates
        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        System.out.println("Extracted Dates: " + String.join(", ", dates));
    }
}
