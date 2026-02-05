import java.util.Scanner;

public class RepunitDivisibilityChecker {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) {
            return -1;
        }

        int remainder = 0;
        
        for (int length = 1; length <= k; length++) {
            
            remainder = (int)(((long)remainder * 10 + 1) % k);
            
            if (remainder == 0) {
                return length;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        scanner.close();

        RepunitDivisibilityChecker solution = new RepunitDivisibilityChecker();
        System.out.println(solution.smallestRepunitDivByK(k));
    }
}