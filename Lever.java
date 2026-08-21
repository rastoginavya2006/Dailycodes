import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Lever {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            long ans = 1;
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    ans += (a[i] - b[i]);
                }
            }
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
