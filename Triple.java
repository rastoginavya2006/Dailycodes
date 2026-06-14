import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.currentTimeMillis() > 0 ? System.in : null));
        StringTokenizer st;
        
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());
            
            int[] freq = new int[n + 1];
            int ans = -1;
            
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                freq[val]++;
                
                if (freq[val] >= 3) {
                    ans = val;
                }
            }
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
