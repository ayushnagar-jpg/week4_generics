package regex.replacespaces;
public class SpaceReducer {
    public static void main(String[] args) {
        String input = "This   is  an   example    with  multiple    spaces.";

        // Replace multiple spaces with a single space
        String result = input.replaceAll("\\s+", " ");

        System.out.println("Original: " + input);
        System.out.println("Modified: " + result);
    }
}
