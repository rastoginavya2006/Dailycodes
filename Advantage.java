import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Advantage {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] strengths = new int[n];
            
            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                strengths[i] = Integer.parseInt(st.nextToken());
                
                if (strengths[i] > max1) {
                    max2 = max1;
                    max1 = strengths[i];
                } else if (strengths[i] > max2) {
                    max2 = strengths[i];
                }
            }
            
            for (int i = 0; i < n; i++) {
                if (strengths[i] == max1) {
                    sb.append(strengths[i] - max2).append(" ");
                } else {
                    sb.append(strengths[i] - max1).append(" ");
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}
