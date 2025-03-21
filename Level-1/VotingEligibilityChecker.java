import java.util.Scanner;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		int[] age = new int[10];
		System.out.print("Enter the age of 10 students : ");
		for(int i=0;i<age.length;i++){
			age[i] = in.nextInt();
		}
		
		for(int i=0;i<age.length;i++){
			if(age[i]>=0){
				if(age[i]>18)
					System.out.println("The Student with the age "+age[i]+" can vote");
				else
					System.out.println("The Student with the age "+age[i]+" cannot vote");
			}
			else
				System.out.println("Enter a vaild age");
		}	
		in.close();		
	}
}
		