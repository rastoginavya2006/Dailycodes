import java.util.Scanner;

public class MatrixSumOptimizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MatrixSumOptimizer program = new MatrixSumOptimizer();

        System.out.print("Enter matrix size (n): ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        long result = program.maxMatrixSum(matrix);
        System.out.println("Maximum Matrix Sum: " + result);

        scanner.close();
    }

    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int minAbs = Integer.MAX_VALUE;
        int negOdd = 0;

        for (int[] row : matrix) {
            for (int x : row) {
                // Keep track of the smallest absolute value in the matrix
                minAbs = Math.min(minAbs, Math.abs(x));
                
                if (x < 0) {
                    sum -= x; // Add the positive value
                    negOdd = 1 - negOdd; // Flip between 0 (even) and 1 (odd)
                } else {
                    sum += x;
                }
            }
        }

        // If the count of negative numbers is odd, we must subtract 
        // twice the smallest absolute value to get the optimal sum.
        return sum - 2L * negOdd * minAbs;
    }
}