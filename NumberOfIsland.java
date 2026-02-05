import java.util.Scanner;

public class NumberOfIsland {

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c);
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        int m = grid.length;
        int n = grid[0].length;

        if (r < 0 || r >= m || c < 0 || c >= n || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the grid for counting islands:");

        System.out.print("Enter number of rows (m): ");
        int m = scanner.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = scanner.nextInt();

        scanner.nextLine();

        char[][] grid = new char[m][n];

        System.out.println("\nEnter each row of the grid (use only '1's and '0's, no spaces):");

        for (int i = 0; i < m; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            String row = scanner.nextLine();

            if (row.length() != n) {
                System.out
                        .println("Error: Row length does not match the number of columns (" + n + "). Please restart.");
                scanner.close();
                return;
            }

            grid[i] = row.toCharArray();
        }

        NumberOfIsland solution = new NumberOfIsland();

        int result = solution.numIslands(grid);

        System.out.println("\n--- Result ---");
        System.out.println("Total number of islands: " + result);

        scanner.close();
    }
}