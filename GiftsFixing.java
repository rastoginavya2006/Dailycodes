import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class GiftsFixing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            long[] a = new long[n];
            long[] b = new long[n];
            
            long minA = Long.MAX_VALUE;
            long minB = Long.MAX_VALUE;
            
            StringTokenizer stA = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(stA.nextToken());
                if (a[i] < minA) {
                    minA = a[i];
                }
            }
            
            StringTokenizer stB = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(stB.nextToken());
                if (b[i] < minB) {
                    minB = b[i];
                }
            }
            
            long totalMoves = 0;
            
            for (int i = 0; i < n; i++) {
                long diffA = a[i] - minA;
                long diffB = b[i] - minB;
                
                
                totalMoves += Math.max(diffA, diffB);
            }
            
            sb.append(totalMoves).append("\n");
        }
        
        System.out.print(sb);
    }
}
