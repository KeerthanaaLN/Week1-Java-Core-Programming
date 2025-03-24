import java.util.Scanner;

public class CharacterFrequency {

    public static String[] findCharacterFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int size = 0;
        for (char c : chars) {
            if (c != '0') size++;
        }

        String[] result = new String[size];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " = " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] output = findCharacterFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        for (String s : output) {
            System.out.println(s);
        }

        scanner.close();
    }
}
