public class UC9_RecursiveCheck {

    public static boolean isPalindrome(String str, int left, int right) {

        // Base case
        if (left >= right)
            return true;

        // If characters not equal → not palindrome
        if (str.charAt(left) != str.charAt(right))
            return false;

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String word = "racecar";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        System.out.println(word + (result ? " is Palindrome" : " is NOT Palindrome"));
    }
}