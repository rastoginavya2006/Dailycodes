import java.util.Scanner;

public class FoxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                // Odd rows are always full
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            } else {
                // Even rows: check if we are going right or left
                if ((i / 2) % 2 != 0) {
                    // Right side (2nd, 6th, 10th...)
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                } else {
                    // Left side (4th, 8th, 12th...)
                    System.out.print("#");
                    for (int j = 0; j < m - 1; j++) {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}