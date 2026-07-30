import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        long x = sc.nextLong();
        long distressed = 0;
        
        for (int i = 0; i < n; i++) {
            char op = sc.next().charAt(0);
            long d = sc.nextLong();
            
            if (op == '+') {
                x += d;
            } else {
                if (x >= d) {
                    x -= d;
                } else {
                    distressed++;
                }
            }
        }
        
        System.out.println(x + " " + distressed);
    }
}
