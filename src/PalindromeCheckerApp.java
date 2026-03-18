import java.util.*;

public class PalindromeCheckerApp {

    // Reverse Method
    public static boolean reverseMethod(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equalsIgnoreCase(reversed);
    }

    // Two Pointer Method
    public static boolean twoPointerMethod(String input) {

        input = input.toLowerCase();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    // ===== UC13 MAIN METHOD =====
    public static void main(String[] args) {

        String word = "racecar";

        // Reverse Method Time
        long start1 = System.nanoTime();
        reverseMethod(word);
        long end1 = System.nanoTime();

        // Two Pointer Method Time
        long start2 = System.nanoTime();
        twoPointerMethod(word);
        long end2 = System.nanoTime();

        System.out.println("Reverse Method Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method Time: " + (end2 - start2) + " ns");
    }
}