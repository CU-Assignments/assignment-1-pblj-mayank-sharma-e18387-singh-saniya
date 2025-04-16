import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        int[][] addition = new int[rows][cols];
        int[][] subtraction = new int[rows][cols];
        int[][] multiplication = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                addition[i][j] = matrix1[i][j] + matrix2[i][j];
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                multiplication[i][j] = 0;
                for (int k = 0; k < cols; k++) {
                    multiplication[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("\nAddition:");
        printMatrix(addition);

        System.out.println("\nSubtraction:");
        printMatrix(subtraction);

        System.out.println("\nMultiplication:");
        printMatrix(multiplication);

        scanner.close();
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
