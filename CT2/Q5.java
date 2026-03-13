package CT2;

public class Q5 {
    public static String capitalizeWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }
        String[] words = sentence.trim().split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1);
                capitalizedSentence.append(firstLetter).append(restOfWord).append(" ");
            }
        }
        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String test1 = "hello world";
        System.out.println("Original: \"" + test1 + "\"\nCapitalized: \"" + capitalizeWords(test1) + "\"");

        String test2 = "  java is   fun ";
        System.out.println("\nOriginal: \"" + test2 + "\"\nCapitalized: \"" + capitalizeWords(test2) + "\"");
    }
}
