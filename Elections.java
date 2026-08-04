import java.util.Scanner;

public class Elections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long ansA = Math.max(0, Math.max(b, c) + 1 - a);
            long ansB = Math.max(0, Math.max(a, c) + 1 - b);
            long ansC = Math.max(0, Math.max(a, b) + 1 - c);
            
            System.out.println(ansA + " " + ansB + " " + ansC);
        }
        sc.close();
    }
}
