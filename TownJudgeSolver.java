import java.util.Scanner;

public class TownJudgeSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TownJudgeSolver solver = new TownJudgeSolver();

        System.out.print("Enter the number of people (n): ");
        int n = scanner.nextInt();

        System.out.print("Enter the number of trust relationships: ");
        int m = scanner.nextInt();

        int[][] trust = new int[m][2];
        System.out.println("Enter the trust pairs (a b):");
        for (int i = 0; i < m; i++) {
            trust[i][0] = scanner.nextInt();
            trust[i][1] = scanner.nextInt();
        }

        int judge = solver.findJudge(n, trust);
        
        if (judge != -1) {
            System.out.println("The town judge is person: " + judge);
        } else {
            System.out.println("There is no town judge.");
        }

        scanner.close();
    }

    public int findJudge(int n, int[][] trust) {
        int[] result = new int[n + 1];
      
        for (int[] arr : trust) {
            int a = arr[0];
            int b = arr[1];
            
            result[a]--;
            result[b]++;
        }

        for (int i = 1; i <= n; i++) {
            if (result[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}