package CT2;

public class Q3 {
    public static String reverseWords(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }
        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String one = "  Hello   World  ";
        System.out.println(one);
        System.out.println(reverseWords(one)); 

        String two = "Java is fun";
        System.out.println(two);
        System.out.println(reverseWords(two)); 
    }
}
