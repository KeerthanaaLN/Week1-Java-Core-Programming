import java.util.Scanner;

public class FrequencyWithCharAt {

    public static String[][] characterFrequency(String text) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        String unique = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(ch) == -1) {
                unique += ch;
            }
        }

        String[][] result = new String[unique.length()][2];

        for (int i = 0; i < unique.length(); i++) {
            char ch = unique.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = String.valueOf(freq[ch]);
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
