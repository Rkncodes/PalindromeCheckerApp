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
        String reversedUC5 = "";

        while (!stack.isEmpty()) {
            reversedUC5 += stack.pop();
        }

// Compare
        if (wordUC5.equals(reversedUC5)) {
            System.out.println(wordUC5 + " is a Palindrome (Stack Method)");
        } else {
            System.out.println(wordUC5 + " is NOT a Palindrome (Stack Method)");
        }

        // UC6 — User Input Palindrome
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter a word: ");
        String userWord = scanner.nextLine();

        String reversedUC6 = "";

// Reverse the input
        for (int i = userWord.length() - 1; i >= 0; i--) {
            reversedUC6 += userWord.charAt(i);
        }

// Check palindrome
        if (userWord.equalsIgnoreCase(reversedUC6)) {
            System.out.println(userWord + " is a Palindrome (User Input)");
        } else {
            System.out.println(userWord + " is NOT a Palindrome (User Input)");
        }
    }
}