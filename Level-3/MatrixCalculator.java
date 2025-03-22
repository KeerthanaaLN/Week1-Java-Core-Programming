import java.util.*;

class MatrixCalculator {

    public static int[][] generateMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                matrix[i][j] = rand.nextInt(10) + 1; // Avoid zeros for inverse
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static int[][] addMatrix(int rows, int columns, int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result[i][j] = matrix1[i][j] + matrix2[i][j];
        return result;
    }

    public static int[][] subMatrix(int rows, int columns, int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result[i][j] = matrix1[i][j] - matrix2[i][j];
        return result;
    }

    public static int[][] mulMatrix(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2)
            throw new IllegalArgumentException("Multiplication not possible");

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++)
            for (int j = 0; j < cols2; j++)
                for (int k = 0; k < cols1; k++)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];

        return result;
    }

    public static int[][] divMatrix(int rows, int columns, int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result[i][j] = matrix2[i][j] != 0 ? matrix1[i][j] / matrix2[i][j] : 0;
        return result;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                result[j][i] = matrix[i][j];
        return result;
    }

    public static int determinant2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2)
            throw new IllegalArgumentException("Matrix is not 2x2");
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    public static int determinant3x3(int[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3)
            throw new IllegalArgumentException("Matrix is not 3x3");

        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
             - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
             + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2)
            throw new IllegalArgumentException("Matrix is not 2x2");

        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[1][0];
        int d = matrix[1][1];

        int det = a * d - b * c;
        if (det == 0)
            throw new ArithmeticException("Matrix is not invertible");

        double[][] inverse = {
            { d / (double) det, -b / (double) det },
            { -c / (double) det, a / (double) det }
        };
        return inverse;
    }

    public static double[][] inverse3x3(int[][] m) {
        if (m.length != 3 || m[0].length != 3)
            throw new IllegalArgumentException("Matrix is not 3x3");

        int det = determinant3x3(m);
        if (det == 0)
            throw new ArithmeticException("Matrix is not invertible");

        double[][] cofactors = new double[3][3];

        cofactors[0][0] = m[1][1]*m[2][2] - m[1][2]*m[2][1];
        cofactors[0][1] = -(m[1][0]*m[2][2] - m[1][2]*m[2][0]);
        cofactors[0][2] = m[1][0]*m[2][1] - m[1][1]*m[2][0];

        cofactors[1][0] = -(m[0][1]*m[2][2] - m[0][2]*m[2][1]);
        cofactors[1][1] = m[0][0]* m[2][2] - m[0][2]*m[2][0];
        cofactors[1][2] = -(m[0][0]*m[2][1] - m[0][1]*m[2][0]);

        cofactors[2][0] = m[0][1]*m[1][2] - m[0][2]*m[1][1];
        cofactors[2][1] = -(m[0][0]*m[1][2] - m[0][2]*m[1][0]);
        cofactors[2][2] = m[0][0]*m[1][1] - m[0][1]*m[1][0];

        double[][] adjugate = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                adjugate[i][j] = cofactors[j][i];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inverse[i][j] = adjugate[i][j] / det;

        return inverse;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = in.nextInt();

        int[][] matrix1 = generateMatrix(rows, columns);
        int[][] matrix2 = generateMatrix(rows, columns);

        System.out.println("\nMatrix 1:");
        displayMatrix(matrix1);

        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        System.out.println("\nAddition:");
        displayMatrix(addMatrix(rows, columns, matrix1, matrix2));

        System.out.println("\nSubtraction:");
        displayMatrix(subMatrix(rows, columns, matrix1, matrix2));

        int[][] matrix2ForMul = generateMatrix(columns, rows);
        System.out.println("\nMatrix 2 (reshaped for multiplication):");
        displayMatrix(matrix2ForMul);

        System.out.println("\nMultiplication:");
        displayMatrix(mulMatrix(matrix1, matrix2ForMul));

        System.out.println("\nDivision:");
        displayMatrix(divMatrix(rows, columns, matrix1, matrix2));

        System.out.println("\nTranspose of Matrix 1:");
        displayMatrix(transposeMatrix(matrix1));

        System.out.println("\nTranspose of Matrix 2:");
        displayMatrix(transposeMatrix(matrix2));

        if (rows == 2 && columns == 2) {
            System.out.println("\nDeterminant of Matrix 1 (2x2): " + determinant2x2(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayMatrix(inverse2x2(matrix1));
        }

        if (rows == 3 && columns == 3) {
            System.out.println("\nDeterminant of Matrix 1 (3x3): " + determinant3x3(matrix1));
            System.out.println("Inverse of Matrix 1:");
            displayMatrix(inverse3x3(matrix1));
        }
    }
}
