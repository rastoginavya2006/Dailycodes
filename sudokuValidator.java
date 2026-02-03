import java.util.Scanner;

public class SudokuValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SudokuValidator solver = new SudokuValidator();

        char[][] board = new char[9][9];
        System.out.println("Enter Sudoku board (9 rows, use '.' for empty cells):");
        
        for (int i = 0; i < 9; i++) {
            String rowInput = scanner.next();
            for (int j = 0; j < 9; j++) {
                board[i][j] = rowInput.charAt(j);
            }
        }

        boolean result = solver.isValidSudoku(board);
        System.out.println("\nIs the Sudoku board valid? " + result);

        scanner.close();
    }

    public boolean check(char[][] board, int row, int col, char digit) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == digit) return false;
        }

        for (int j = 0; j < 9; j++) {
            if (board[row][j] == digit) return false;
        }

        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == digit) return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;

                char val = board[i][j];
                board[i][j] = '.';
                if (!check(board, i, j, val)) {
                    return false;
                }
                board[i][j] = val;
            }
        }
        return true;
    }
}