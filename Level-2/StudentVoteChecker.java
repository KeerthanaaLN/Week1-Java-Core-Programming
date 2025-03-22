import java.util.*;

public class StudentVoteChecker {
    
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; 
        }
        return age >= 18; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] age = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + " : ");
            age[i] = in.nextInt();

            boolean result = canStudentVote(age[i]);
            
            if (result)
                System.out.println("Student " + (i + 1) + " can vote");
            else
                System.out.println("Student " + (i + 1) + " can't vote");
        }

        in.close();
    }
}
