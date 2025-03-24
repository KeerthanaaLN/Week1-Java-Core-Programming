import java.util.*;

class StringComparator {
    
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
        
        System.out.print("Enter first string: ");
        String str1 = in.next();
        
        System.out.print("Enter second string: ");
        String str2 = in.next();

        boolean result1 = isCompareString(str1, str2);
        
        boolean result2 = str1.equals(str2);
        
        System.out.println("Comparison using charAt(): " + result1);
        System.out.println("Comparison using equals(): " + result2);
        
        if (result1 == result2) {
            System.out.println("Both methods return the same result.");
        } else {
            System.out.println("Methods return different results.");
        }
        
        in.close();
    }
}
