import java.util.*;

public class PalindromeChecker {
    
    public static String getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine().toLowerCase();
        in.close();
        return input;
    }
    
    public static boolean isPalindrome(String str) {
		char[] charArray = str.toCharArray();
        String reversed = "";
        
        for (char ch : charArray) {
            reversed = ch + reversed;
        }
        
        return str.equals(reversed);
    }
    
    public static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
    
    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(input, result);
    }
}
