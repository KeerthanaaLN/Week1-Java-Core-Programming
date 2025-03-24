import java.util.*;

public class SplitTextCompare {

    static int findLength(String str) {
        int index = 0;
        try {
            while (true) {
                str.charAt(index);
                index++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return index;
    }

    static String[] splitText(String str) {
        int length = findLength(str);
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count + 1];
        String word = "";
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                word += str.charAt(i);
            } else {
                words[wordIndex++] = word;
                word = "";
            }
        }
        words[wordIndex] = word;

        return words;
    }

    static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = in.nextLine();

        String[] builtInSplit = input.split(" ");
        String[] customSplit = splitText(input);

        System.out.println("\nWords from custom split method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords from built-in split method:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        boolean result = compareArrays(customSplit, builtInSplit);
        System.out.println("\nAre both split methods equal? " + result);
    }
}
