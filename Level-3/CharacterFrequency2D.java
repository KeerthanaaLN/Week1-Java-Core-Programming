import java.util.Scanner;

public class CharacterFrequency2D {

    public static char[] uniqueCharacters(String text) {
        String unique = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                unique += ch;
            }
        }

        return unique.toCharArray();
    }

    public static String[][] characterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = in.nextLine();

        String[][] output = characterFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        for (int i = 0; i < output.length; i++) {
            System.out.println(output[i][0] + " = " + output[i][1]);
        }

        in.close();
    }
}
