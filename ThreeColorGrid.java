import java.util.Scanner;

public class ThreeColorGrid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThreeColorGrid program = new ThreeColorGrid();

        System.out.print("Enter the number of rows (n): ");
        int n = scanner.nextInt();

        int result = program.numOfWays(n);
        System.out.println("Total number of ways to color the grid: " + result);

        scanner.close();
    }

    public int numOfWays(int n) {
        if (n == 0) return 0;
        final int MOD = 1_000_000_007;
        
        // A represents patterns with 2 colors (e.g., ABA)
        // B represents patterns with 3 colors (e.g., ABC)
        long A = 6, B = 6;
        
        for (int i = 2; i <= n; i++) {
            long nextA = (3 * A + 2 * B) % MOD;
            long nextB = (2 * A + 2 * B) % MOD;
            A = nextA;
            B = nextB;
        }
        
        return (int) ((A + B) % MOD);
    }
}