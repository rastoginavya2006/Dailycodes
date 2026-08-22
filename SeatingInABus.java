import java.util.Scanner;

public class SeatingInABus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            boolean[] vis = new boolean[n + 2];
            boolean ok = true;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
               
                if (i > 0 && !vis[x - 1] && !vis[x + 1]) {
                    ok = false;
                }
                vis[x] = true; 
            }
            
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
