import java.util.*;

class LowercaseConverter {

    static String convertToLowercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32); 
            } else {
                result += ch;
            }
        }
        return result;
    }

    static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = in.nextLine();

        String customLowercase = convertToLowercase(input);

        String builtInLowercase = input.toLowerCase();

        boolean areEqual = compareStrings(customLowercase, builtInLowercase);

        System.out.println("Lowercase using user-defined method: " + customLowercase);
        System.out.println("Lowercase using toLowerCase(): " + builtInLowercase);
        System.out.println("Comparison result: " + areEqual);

        if (areEqual) {
            System.out.println("Both methods produce the same lowercase text.");
        } else {
            System.out.println("Methods produce different lowercase text.");
        }

        in.close();
    }
}
