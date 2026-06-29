import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int x = 0;
            int y = 0;
            boolean reachedCandy = false;
            
            for (int i = 0; i < n; i++) {
                char move = s.charAt(i);
                
                if (move == 'U') {
                    y++;
                } else if (move == 'D') {
                    y--;
                } else if (move == 'R') {
                    x++;
                } else if (move == 'L') {
                    x--;
                }
                
                if (x == 1 && y == 1) {
                    reachedCandy = true;
                    break;
                }
            }
            
            if (reachedCandy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
