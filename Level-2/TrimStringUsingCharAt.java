import java.util.*;

public class TrimStringUsingCharAt {

    static int[] findTrimIndices(String str) {
        int start = 0, end = str.length() - 1;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }

    static String manualSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        if (input.length() == 0) {
            System.out.println("Input string is empty.");
            return;
        }

        int[] trimIndices = findTrimIndices(input);

        if (trimIndices[0] > trimIndices[1]) {
            System.out.println("String has only spaces or is empty after trimming.");
            return;
        }

        String trimmedManual = manualSubstring(input, trimIndices[0], trimIndices[1]);
        String trimmedBuiltIn = input.trim();
        boolean isEqual = compareStrings(trimmedManual, trimmedBuiltIn);

        System.out.println("\nManual Trim Result: \"" + trimmedManual + "\"");
        System.out.println("Built-in Trim Result: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both strings equal? " + isEqual);
    }
}
