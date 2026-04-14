import java.util.*;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int r = sc.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int totalCost = i * k;
            
            if (totalCost % 10 == 0 || totalCost % 10 == r) {
                System.out.println(i);
                break;
            }
        }
        
        sc.close();
    }
}
