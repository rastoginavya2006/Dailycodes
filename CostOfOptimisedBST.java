
import java.util.Scanner;

public class CostOfOptimisedBST {

    public static int findOptimalCost(int N, int[] keys, int[] freq) {
        if (N == 0) {
            return 0;
        }

        int[] prefixSum = new int[N + 1];
        for (int i = 0; i < N; i++) {
            prefixSum[i + 1] = prefixSum[i] + freq[i];
        }

        java.util.function.BiFunction<Integer, Integer, Integer> sumFreq = (i, j) -> {
            if (i > j) return 0;
            return prefixSum[j + 1] - prefixSum[i];
        };

        int[][] C = new int[N][N];

        for (int i = 0; i < N; i++) {
            C[i][i] = freq[i];
        }

        for (int L = 2; L <= N; L++) {
            for (int i = 0; i <= N - L; i++) {
                int j = i + L - 1;
                
                C[i][j] = Integer.MAX_VALUE;

                int currentSumFreq = sumFreq.apply(i, j);

                for (int k = i; k <= j; k++) {
                    int costLeft = (k == i) ? 0 : C[i][k - 1];
                    int costRight = (k == j) ? 0 : C[k + 1][j];
                    
                    int currentCost = costLeft + costRight + currentSumFreq;
                    
                    if (currentCost < C[i][j]) {
                        C[i][j] = currentCost;
                    }
                }
            }
        }

        return C[0][N - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] keys = new int[N];
        for (int i = 0; i < N; i++) {
            keys[i] = scanner.nextInt();
        }

        int[] freq = new int[N];
        for (int i = 0; i < N; i++) {
            freq[i] = scanner.nextInt();
        }

        scanner.close();

        System.out.println(findOptimalCost(N, keys, freq));
    }
}