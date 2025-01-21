package Ch4_MD_Array;
import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        double[][] matrix1 = new double[3][3];
        double[][] matrix2 = new double[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the elements of the first 3x3 matrix:");
        fillMatrix(scanner, matrix1);

        System.out.println("Enter the elements of the second 3x3 matrix:");
        fillMatrix(scanner, matrix2);

        double[][] sum = addMatrices(matrix1, matrix2);
        System.out.println("The sum of the two matrices is:");
        printMatrix(sum);

        scanner.close();
    }

    private static void fillMatrix(Scanner scanner, double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static double[][] addMatrices(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[3][3];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }
}