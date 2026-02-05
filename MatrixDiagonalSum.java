import java.util.Scanner;

public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = mat.length - 1;
        int sum = 0;

        while (i < mat.length) {
            sum += mat[i][i];
            
            if (i != j) {
                sum += mat[i][j];
            }
            
            i++;
            j--;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MatrixDiagonalSum sol = new MatrixDiagonalSum();

        System.out.print("Enter matrix size (n for n x n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter the elements of the matrix:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        int result = sol.diagonalSum(matrix);
        System.out.println("The diagonal sum is: " + result);

        sc.close();
    }
}