import java.util.Scanner;

public class VasyaAndCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            long a = scanner.nextLong(); 
            long b = scanner.nextLong(); 
            
            if (a == 0) {
                
                System.out.println(1);
            } else {
                
                System.out.println(a + 2 * b + 1);
            }
        }
        
        scanner.close();
    }
}
