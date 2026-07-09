import java.util.Scanner;

public class PerfectPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n % 2 != 0) {
            System.out.println(-1);
        } else {
            
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n; i += 2) {
                sb.append(i + 1).append(" ").append(i).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        
        scanner.close();
    }
}
