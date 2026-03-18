class PalindromeService {

    public boolean isPalindrome(String input) {

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
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();

        String text = "Madam";

        boolean result = service.isPalindrome(text);

        System.out.println(text +
                (result ? " is Palindrome" : " is NOT Palindrome"));
    }
}