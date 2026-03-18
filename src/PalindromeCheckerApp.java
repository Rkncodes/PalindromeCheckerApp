public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("=== PALINDROME CHECKER APP ===");

        // UC2 — Hardcoded Palindrome
        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}