import java.util.*;

class NumberFormatExceptionDemo {

    public static void createException(String str) {
        
        System.out.println(Integer.parseInt(str));
    }

    public static void handleException(String str) {    
        int length = str.length();
        
        try {
            System.out.println(Integer.parseInt(str));
        } 
        catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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
