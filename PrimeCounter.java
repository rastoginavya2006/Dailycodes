import java.util.*;

public class PrimeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrimeCounter program = new PrimeCounter();

        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        int result = program.countPrimes(n);
        System.out.println("Number of primes strictly less than " + n + ": " + result);

        scanner.close();
    }

    public int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        if (n > 0) isPrime[0] = false;
        if (n > 1) isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        return count;
    }
}