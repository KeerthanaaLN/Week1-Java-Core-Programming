import java.util.*;

class SubstringExtractor {
    
    static String generateSubString(String str, int startIndex, int endIndex) {
        String result = "";
        for (int i = startIndex; i < endIndex; i++) { 
            result += str.charAt(i);
        }
        return result;
    }

    static boolean isCompareString(String str1, String str2) {
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
        String str = in.next();

        System.out.print("Enter the starting index of substring: ");
        int startIndex = in.nextInt();
        
        System.out.print("Enter the ending index of substring: ");
        int endIndex = in.nextInt();

        String substring1 = generateSubString(str, startIndex, endIndex);
        String substring2 = str.substring(startIndex, endIndex);

        boolean comparisonResult = isCompareString(substring1, substring2);
        
        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Result: " + comparisonResult);

        if (comparisonResult) {
            System.out.println("Both methods produce the same substring.");
        } else {
            System.out.println("Methods produce different substrings.");
        }

        in.close();
    }
}
