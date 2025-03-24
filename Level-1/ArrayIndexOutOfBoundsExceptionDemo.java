import java.util.*;

class ArrayIndexOutOfBoundsExceptionDemo {

    public static void createException(String[] names) {
        
		for(int i=0;i<names.length+1;i++){
			System.out.println(names[i]);
		}
    }

    public static void handleException(String[] names) {    
        
        try {
            for(int i=0;i<names.length+1;i++){
				System.out.println(names[i]);
			}
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException : " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		String[] names = new String[5];
		
		for(int i=0;i<names.length;i++){
			System.out.print("Enter student "+(i+1)+" name : ");
			names[i] = in.nextLine();
		}
		
        // createException(names);
        
        handleException(names);

        in.close();
    }
}
