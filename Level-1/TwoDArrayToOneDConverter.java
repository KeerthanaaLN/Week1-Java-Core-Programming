import java.util.Scanner;

public class TwoDArrayToOneDConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
        System.out.println("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int columns = in.nextInt();
		
        int[][] twoMatrix = new int[rows][columns];
        int[] oneMatrix = new int[rows * columns];

        // Input 2D array elements
        System.out.println("Enter " + (rows * columns) + " elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoMatrix[i][j] = in.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("2D Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoMatrix[i][j] + " ");
            }
            System.out.println(); 
        }

        // Convert 2D array to 1D array
        int onedIndex = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                oneMatrix[onedIndex++] = twoMatrix[i][j];
            }
        }

        // Print the 1D array
        System.out.println("Converted 1D Array:");
        for (int i = 0; i < rows * columns; i++) {
            System.out.print(oneMatrix[i] + " ");
        }
        System.out.println(); // New line for clean output

        in.close();
    }
}
