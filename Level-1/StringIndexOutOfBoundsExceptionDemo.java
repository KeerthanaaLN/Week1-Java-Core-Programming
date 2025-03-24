import java.util.*;

class StringIndexOutOfBoundsExceptionDemo{

	public static void createException(String str){	
		int length = str.length();
		System.out.println(str.charAt(length+1));
	}
	
	public static void handleException(String str){
		int length = str.length();
		try{
			System.out.println(str.charAt(length+1));
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Caught StringIndexOutOfBoundsException : "+e.getMessage());
		}
		
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	
		System.out.print("Enter a String : ");
		String str = in.nextLine();
		
		//createException(str);
		
		handleException(str);
	}
}