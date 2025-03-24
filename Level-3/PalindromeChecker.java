import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeUsingCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseUsingCharAt(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a text to check for palindrome: ");
        String input = in.nextLine();

        String normalizedInput = input.replaceAll("\\s+", "").toLowerCase();

        System.out.println("\nChecking: " + input);

        boolean result1 = isPalindromeIterative(normalizedInput);
        System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not a Palindrome"));

        boolean result2 = isPalindromeRecursive(normalizedInput, 0, normalizedInput.length() - 1);
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not a Palindrome"));

        boolean result3 = isPalindromeUsingCharArray(normalizedInput);
        System.out.println("Logic 3 (Char Array): " + (result3 ? "Palindrome" : "Not a Palindrome"));

        in.close();
    }
}
