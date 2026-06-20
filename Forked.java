import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Forked { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); 
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int xK = sc.nextInt();
            int yK = sc.nextInt();
            
            int xQ = sc.nextInt();
            int yQ = sc.nextInt();
            
            int[] dx = {a, a, -a, -a, b, b, -b, -b};
            int[] dy = {b, -b, b, -b, a, -a, a, -a};
            
            Set<String> kingMoves = new HashSet<>();
            Set<String> queenMoves = new HashSet<>();
            
            for (int i = 0; i < 8; i++) {
                int nx = xK + dx[i];
                int ny = yK + dy[i];
                kingMoves.add(nx + "," + ny); 
            }
            
            for (int i = 0; i < 8; i++) {
                int nx = xQ + dx[i];
                int ny = yQ + dy[i];
                queenMoves.add(nx + "," + ny);
            }
            
            int ans = 0;
            for (String move : kingMoves) {
                if (queenMoves.contains(move)) {
                    ans++;
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
