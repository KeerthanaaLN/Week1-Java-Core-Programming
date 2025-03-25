import java.util.*;

class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Think of a number between 1 and 100...");
        System.out.println("I will try to guess the number.");

        System.out.print("How many times should I guess? ");
        int guessTimes = in.nextInt();
        
        int low = 1, high = 100, guess;
		
		guess = (int) (Math.random() * 101);
        System.out.println("My guess is: " + guess);

        for (int i = 0; i < guessTimes; i++) {

            System.out.print("Is my guess (correct/high/low)? ");
            String feedback = in.next().toLowerCase();

            if (feedback.equals("correct")) {
                System.out.println("I'm genius!!!");
                break;
            } else if (feedback.equals("high")) {
                guess -=1;
				System.out.println("My guess is: " + guess);
            } else if (feedback.equals("low")) {
                guess+= 1;
				System.out.println("My guess is: " + guess);
            } else {
                System.out.println("Invalid input. Please enter 'correct', 'high', or 'low'.");
            }
        }

        System.out.println("Game over. Thanks for playing!");
        in.close();
    }
}
