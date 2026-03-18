import java.util.*;

public class UC8_LinkedListCheck {

    public static void main(String[] args) {

        String word = "madam";
        LinkedList<Character> list = new LinkedList<>();

        // Add characters to linked list
        for (char c : word.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last elements
        while (list.size() > 1) {
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(word + (isPalindrome ? " is Palindrome" : " is NOT Palindrome"));
    }
}