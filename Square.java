import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            
            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x);
            }
            
            int side = maxX - minX;
            int area = side * side;
            
            System.out.println(area);
        }
        sc.close();
    }
}
