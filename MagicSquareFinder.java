import java.util.Scanner;

public class MagicSquareFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MagicSquareFinder finder = new MagicSquareFinder();

        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        int[][] grid = new int[m][n];
        System.out.println("Enter the grid elements row by row:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        int result = finder.largestMagicSquare(grid);
        System.out.println("\nSize of the largest magic square found: " + result);

        scanner.close();
    }

    public int largestMagicSquare(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // Start from the largest possible side and work down (Greedy)
        int side = Math.min(m, n);

        while (side > 1) {
            for (int i = 0; i <= m - side; i++) {
                for (int j = 0; j <= n - side; j++) {
                    if (isValid(grid, i, j, side)) return side;
                }
            }
            side--;
        }

        return 1; // A single cell is always a magic square of size 1
    }

    private boolean isValid(int[][] grid, int r, int c, int side) {
        int targetSum = 0;

        // Get the target sum from the first row of this subgrid
        for (int j = c; j < c + side; j++) {
            targetSum += grid[r][j];
        }

        // Check rows
        for (int i = r + 1; i < r + side; i++) {
            int currentRowSum = 0;
            for (int j = c; j < c + side; j++) {
                currentRowSum += grid[i][j];
            }
            if (currentRowSum != targetSum) return false;
        }

        // Check columns
        for (int j = c; j < c + side; j++) {
            int currentColSum = 0;
            for (int i = r; i < r + side; i++) {
                currentColSum += grid[i][j];
            }
            if (currentColSum != targetSum) return false;
        }

        // Check main diagonal
        int mainDiagSum = 0;
        for (int k = 0; k < side; k++) {
            mainDiagSum += grid[r + k][c + k];
        }
        if (mainDiagSum != targetSum) return false;

        // Check anti-diagonal
        int antiDiagSum = 0;
        for (int k = 0; k < side; k++) {
            antiDiagSum += grid[r + k][c + side - 1 - k];
        }
        if (antiDiagSum != targetSum) return false;

        return true;
    }
}