import java.util.*;

public class SplitTextShortestLongest {

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

    static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    static String[] getShortestAndLongestWords(String[][] wordArray) {
        String shortest = wordArray[0][0];
        String longest = wordArray[0][0];
        int minLen = Integer.parseInt(wordArray[0][1]);
        int maxLen = Integer.parseInt(wordArray[0][1]);

        for (int i = 1; i < wordArray.length; i++) {
            int currentLen = Integer.parseInt(wordArray[i][1]);
            if (currentLen < minLen) {
                minLen = currentLen;
                shortest = wordArray[i][0];
            }
            if (currentLen > maxLen) {
                maxLen = currentLen;
                longest = wordArray[i][0];
            }
        }

        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitText(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);

        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            String word = wordsWithLengths[i][0];
            int length = Integer.parseInt(wordsWithLengths[i][1]);
            System.out.println(word + "\t" + length);
        }

        String[] result = getShortestAndLongestWords(wordsWithLengths);
        System.out.println("\nShortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
