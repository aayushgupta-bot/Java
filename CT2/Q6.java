package CT2;

public class Q6 {
    public static String removeDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String text = "programming is fun";
        System.out.println("Original string: \"" + text + "\"");
        System.out.println("After removing duplicates: \"" + removeDuplicateCharacters(text) + "\"");
    }
}
