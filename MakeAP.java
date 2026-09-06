import java.util.Scanner;

public class MakeAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            long targetA = (2 * b) - c;
            long targetC = (2 * b) - a;
            
            if (targetA > 0 && targetA % a == 0) {
                System.out.println("YES");
            } else if ((a + c) % 2 == 0 && ((a + c) / 2) % b == 0) {
                System.out.println("YES");
            } else if (targetC > 0 && targetC % c == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
