import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PascalsTriangle program = new PascalsTriangle();

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        List<List<Integer>> triangle = program.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }

        scanner.close();
    }

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }
        
        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();
        
        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }
        
        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }
        
        prevRows.add(newRow);
        return prevRows;
    }
}