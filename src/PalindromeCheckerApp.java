import java.util.*;

public class UC7_DequeCheck {

    public static void main(String[] args) {

        String word = "level";
        Deque<Character> deque = new ArrayDeque<>();

        // Add characters to deque
        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and back
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(word + (isPalindrome ? " is Palindrome" : " is NOT Palindrome"));
    }
}