package regex.censorbadwords;
import java.util.Arrays;
import java.util.List;

public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        // List of bad words
        List<String> badWords = Arrays.asList("damn", "stupid");

        // Replace each bad word with "****"
        for (String badWord : badWords) {
            input = input.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        System.out.println("Censored Text: " + input);
    }
}
