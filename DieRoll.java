import java.util.Scanner;

public class DieRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int y = sc.nextInt();
            int w = sc.nextInt();
            int maxRoll = Math.max(y, w);
            
            int favorable = 6 - maxRoll + 1;
            int total = 6;
            
            int gcd = gcd(favorable, total);
            
            System.out.println((favorable / gcd) + "/" + (total / gcd));
        }
        sc.close();
    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
