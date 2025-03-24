import java.util.*;

class IllegalArgumentExceptionDemo {

    public static void createException(String str) {
        int length = str.length();
        
        System.out.println(str.substring(length + 1, length));
    }

    public static void handleException(String str) {    
        int length = str.length();
        
        try {
            System.out.println(str.substring(length + 1, length));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = in.nextLine();

        // createException(str);
        
        handleException(str);

        in.close();
    }
}
