package Ch4_MD_Array;

public class Homework3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        printDiagonals(matrix);
    }

    private static void printDiagonals(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int col = 0; col < m; col++) {
            printDiagonal(matrix, 0, col);
        }

        for (int row = 1; row < n; row++) {
            printDiagonal(matrix, row, 0);
        }
    }

    private static void printDiagonal(int[][] matrix, int startRow, int startCol) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row = startRow;
        int col = startCol;

        while (row < n && col < m) {
            System.out.print(matrix[row][col] + " ");
            row++;
            col++;
        }
        System.out.println();
    }
}