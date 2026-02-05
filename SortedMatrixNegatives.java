import java.util.Scanner;

public class SortedMatrixNegatives {

    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = cols - 1;
        int count = 0;

        while (row < rows && col >= 0) {
            if (grid[row][col] >= 0) {
                row++;
            } else {
                count += rows - row;
                col--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SortedMatrixNegatives solver = new SortedMatrixNegatives();

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] grid = new int[r][c];

        System.out.println("Enter the matrix elements (sorted non-increasingly):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = solver.countNegatives(grid);
        System.out.println("Total negative numbers: " + result);

        sc.close();
    }
}