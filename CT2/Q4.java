package CT2;

public class Q4 {
    public static String replaceChar(String str, char oldChar, char newChar) {
        if (str == null) {
            return null;
        }
        return str.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        String original = "hello world";
        char toReplace = 'l';
        char replacement = 'x';
        String result = replaceChar(original, toReplace, replacement);
        System.out.println("Original: \"" + original + "\"");
        System.out.println("Replaced '" + toReplace + "' with '" + replacement + "': \"" + result + "\"");

        System.out.println("\nOriginal: \"testing with test data\"");
        System.out.println("Replaced 't' with 'z': \"" + replaceChar("testing with test data", 't', 'z') + "\"");
    }
}
