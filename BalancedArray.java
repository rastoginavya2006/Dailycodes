import java.util.Scanner;

public class BalancedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                
                if ((n / 2) % 2 != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    
                    long sumEven = 0;
                    long sumOdd = 0;
                    
                    for (int i = 1; i <= n / 2; i++) {
                        int evenVal = i * 2;
                        System.out.print(evenVal + " ");
                        sumEven += evenVal;
                    }
                    )
                    for (int i = 1; i < n / 2; i++) {
                        int oddVal = i * 2 - 1;
                        System.out.print(oddVal + " ");
                        sumOdd += oddVal;
                    }
                    
                    System.out.println(sumEven - sumOdd);
                }
            }
        }
        
        sc.close();
    }
}
