import java.util.*;

class StudentDetails {
    
    static int[][] generateMarks(int noOfStudents) {
        Random rand = new Random();
        int[][] marks = new int[noOfStudents][3];
        
        for (int i = 0; i < noOfStudents; i++) {
            marks[i][0] = rand.nextInt(101);
            marks[i][1] = rand.nextInt(101);
            marks[i][2] = rand.nextInt(101);
        }
        return marks;
    }
    
    static float[][] calculateTotal(int[][] marks) {
        int noOfStudents = marks.length;
        float[][] results = new float[noOfStudents][4];
        
        for (int i = 0; i < noOfStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            float avg = total / 3.0f;
            float percentage = Math.round(avg * 100.0) / 100.0f;
            char grade;
            
            if (percentage >= 80) grade = 'A';
            else if (percentage >= 70) grade = 'B';
            else if (percentage >= 60) grade = 'C';
            else if (percentage >= 50) grade = 'D';
            else if (percentage >= 40) grade = 'E';
            else grade = 'F';
            
            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percentage;
            results[i][3] = grade;
        }
        return results;
    }
    
    static void display(int[][] marks, float[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" + (int) results[i][0] + "\t");
            System.out.printf("%.2f\t%.2f\t\t%c\n", results[i][1], results[i][2], (char) results[i][3]);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int noOfStudents = in.nextInt();
        
        int[][] marks = generateMarks(noOfStudents);
        float[][] results = calculateTotal(marks);
        
        display(marks, results);
        
        in.close();
    }
}
