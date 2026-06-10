import java.util.Scanner;

public class MinimalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            while (t-- > 0) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                int minSide = Math.min(a, b);
                int maxSide = Math.max(a, b);
                
                int squareSide = Math.max(maxSide, 2 * minSide);
                
                System.out.println(squareSide * squareSide);
            }
        }
        
        sc.close();
    }
}
