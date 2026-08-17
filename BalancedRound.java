import java.util.*;
import java.io.*;

public class BalancedRound {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder(); 
       
        String firstLine = br.readLine();
        if (firstLine == null) return;
        int t = Integer.parseInt(firstLine.trim());
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            
            
            Long[] arr = new Long[n]; 
            
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }
            
            if (n == 0) {
                out.append(0).append("\n");
                continue;
            }
            
            
            Arrays.sort(arr); 
            
            int max = 1;
            int curr = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i] - arr[i - 1] <= k) {
                    curr++;
                } else {
                    curr = 1;
                }
                max = Math.max(max, curr);
            }
            
            out.append(n - max).append("\n");
        }
        
        
        System.out.print(out);
    }
}
