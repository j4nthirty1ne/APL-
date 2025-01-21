package Ch4_MD_Array;

public class Homework2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // Get matrix dimensions
        int n = matrix.length;       // Number of rows
        int m = matrix[0].length;   // Number of columns

        // Loop through each diagonal
        for (int start = 0; start < n + m - 1; start++) {
            int row, col;

            if (start < m) {
                row = n - 1;
                col = start;
            } else {
                row = n - 1 - (start - m + 1);
                col = m - 1;
            }

            // Traverse each diagonal
            while (row >= 0 && col >= 0) {
                System.out.print(matrix[row][col] + " ");
                row--;
                col--;
            }
            System.out.println();
        }
    }
}
