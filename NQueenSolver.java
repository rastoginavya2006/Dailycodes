import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NQueensSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NQueensSolver solver = new NQueensSolver();

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        List<List<String>> solutions = solver.solveNQueens(n);

        System.out.println("Total solutions found: " + solutions.size());
        for (int i = 0; i < solutions.size(); i++) {
            System.out.println("Solution " + (i + 1) + ":");
            for (String row : solutions.get(i)) {
                System.out.println(row);
            }
            System.out.println();
        }
        scanner.close();
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();
        char[][] nQueens = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        
        solve(n, output, nQueens, 0);
        return output;
    }

    private void solve(int n, List<List<String>> output, char[][] nQueens, int row) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : nQueens) {
                solution.add(new String(rowArray));
            }
            output.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafePlace(n, nQueens, row, col)) {
                nQueens[row][col] = 'Q';
                solve(n, output, nQueens, row + 1);
                nQueens[row][col] = '.';
            }
        }
    }

    private boolean isSafePlace(int n, char[][] nQueens, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}