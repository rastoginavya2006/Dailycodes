import java.util.Scanner;

public class LongestGoodArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return; 
        
        int t = scanner.nextInt();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            
            long dist = r - l;
            long left = 1;
            long right = 2_000_000_000L; 
            long ans = 1;

            while (left <= right) {
                long mid = left + (right - left) / 2;
                long required = mid * (mid - 1) / 2;

                if (required <= dist) {
                    ans = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            out.append(ans).append("\n");
        }
        
        System.out.print(out);
        scanner.close();
    }
}
