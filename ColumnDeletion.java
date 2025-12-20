import java.util.Scanner;

public class ColumnDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ColumnDeletion program = new ColumnDeletion();

        int n = scanner.nextInt();
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = scanner.next();
        }

        System.out.println(program.minDeletionSize(strs));
        scanner.close();
    }

    public int minDeletionSize(String[] strs) {
        int res = 0;
        for (int j = 0; j < strs[0].length(); j++) {
            res += isUnsorted(strs, j);
        }
        return res;
    }

    private int isUnsorted(String[] strs, int j) {
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                return 1;
            }
        }
        return 0;
    }
}