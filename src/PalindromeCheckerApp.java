public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // UC1 — Welcome Message
        System.out.println("=================================");
        System.out.println("     PALINDROME CHECKER APP      ");
        System.out.println("=================================");
        System.out.println("Version : 1.0.0");
        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("Program ready...\n");

        // UC3 — Hardcoded Result
        System.out.println("madam is a Palindrome");

        // UC4 — Character Array Based Palindrome
        String wordUC4 = "level";
        char[] chars = wordUC4.toCharArray();

        boolean isPalindrome = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(wordUC4 + " is a Palindrome");
        } else {
            System.out.println(wordUC4 + " is NOT a Palindrome");
        }

        // UC5 — Stack Based Palindrome
        String wordUC5 = "radar";

        java.util.Stack<Character> stack = new java.util.Stack<>();

// Push characters
        for (int i = 0; i < wordUC5.length(); i++) {
            stack.push(wordUC5.charAt(i));
        }

// Build reversed word using stack
        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

// Compare
        if (wordUC5.equals(reversed)) {
            System.out.println(wordUC5 + " is a Palindrome (Stack Method)");
        } else {
            System.out.println(wordUC5 + " is NOT a Palindrome (Stack Method)");
        }
    }
}