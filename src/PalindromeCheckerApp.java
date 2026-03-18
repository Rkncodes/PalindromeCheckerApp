public class UC10_CaseInsensitiveCheck {

    public static boolean isPalindrome(String input) {

        // Remove spaces & convert to lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right))
                return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String text = "A man a plan a canal Panama";

        boolean result = isPalindrome(text);

        System.out.println("\"" + text + "\"" +
                (result ? " is Palindrome" : " is NOT Palindrome"));
    }
}