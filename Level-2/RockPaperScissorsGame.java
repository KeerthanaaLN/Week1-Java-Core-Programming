import java.util.*;

public class RockPaperScissorsGame {

    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
    }

    static String determineWinner(String player, String computer) {
        if (player.equalsIgnoreCase(computer)) return "Draw";
        if ((player.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (player.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (player.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    static String[][] calculateStats(String[][] gameData) {
        int playerWins = 0, computerWins = 0, draws = 0;
        int totalGames = gameData.length;

        for (String[] game : gameData) {
            switch (game[2]) {
                case "Player" -> playerWins++;
                case "Computer" -> computerWins++;
                case "Draw" -> draws++;
            }
        }

        String[][] stats = new String[3][2];
        stats[0][0] = "Player Wins";
        stats[0][1] = playerWins + " (" + String.format("%.2f", (playerWins * 100.0 / totalGames)) + "%)";
        stats[1][0] = "Computer Wins";
        stats[1][1] = computerWins + " (" + String.format("%.2f", (computerWins * 100.0 / totalGames)) + "%)";
        stats[2][0] = "Draws";
        stats[2][1] = draws + " (" + String.format("%.2f", (draws * 100.0 / totalGames)) + "%)";
        return stats;
    }

    static void displayResults(String[][] gameData, String[][] stats) {
        System.out.println("\nGame\tPlayer\t\tComputer\tWinner");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < gameData.length; i++) {
            System.out.println((i + 1) + "\t" + gameData[i][0] + "\t\t" + gameData[i][1] + "\t\t" + gameData[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("-----------------------------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + " : " + stat[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameData = new String[games][3];

        for (int i = 0; i < games; i++) {
            System.out.print("Game " + (i + 1) + " - Enter Rock, Paper, or Scissors: ");
            String playerChoice = sc.nextLine();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);
            gameData[i][0] = playerChoice;
            gameData[i][1] = computerChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(gameData);
        displayResults(gameData, stats);
    }
}
