import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SocialExperiment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            if (!st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
            }
            
            int n = Integer.parseInt(st.nextToken());
            
            if (n == 2) {
                sb.append("2\n");
            } else if (n == 3) {
                sb.append("3\n");
            } else {
                sb.append(n % 2).append("\n");
            }
        }
        
        System.out.print(sb);
    }
}
