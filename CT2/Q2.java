package CT2;

public class Q2 {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        System.out.println(test1 + isPalindrome(test1));

        String test2 = "hello";
        System.out.println(test2 + isPalindrome(test2));

        String test3 = "madam";
        System.out.println(test3 + isPalindrome(test3));
    }
}
