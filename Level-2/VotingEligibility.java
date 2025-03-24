import java.util.*;

public class VotingEligibility {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(32)+4; // generates ages from 4 to 35
        }
        return ages;
    }

    static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "False";
            } else if (age >= 18) {
                result[i][1] = "True";
            } else {
                result[i][1] = "False";
            }
        }
        return result;
    }

    static void displayResult(String[][] table) {
        System.out.println("\nStudent\tAge\tCan Vote");
        System.out.println("-----------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println("S" + (i + 1) + "\t" + table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Generating random ages (10 to 25) for " + n + " students...");
        int[] ages = generateAges(n);
        String[][] votingResults = checkVotingEligibility(ages);
        displayResult(votingResults);
    }
}
