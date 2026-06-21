import java.util.Scanner;

public class YogurtSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                
                if (2 * a <= b) {
                    System.out.println(n * a);
                } 
                else {
                    int pairsCost = (n / 2) * b;
                    int remainderCost = (n % 2) * a;
                    System.out.println(pairsCost + remainderCost);
                }
            }
        }
        
        sc.close();
    }
}
