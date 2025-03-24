import java.util.Scanner;

public class AnagramChecker {

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = in.nextLine();

        System.out.print("Enter second text: ");
        String text2 = in.nextLine();

        System.out.println("\nAre the texts anagrams? " + (areAnagrams(text1, text2) ? "Yes" : "No"));

        in.close();
    }
}
