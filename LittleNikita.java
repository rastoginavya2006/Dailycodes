import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LittleNikita {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        
        if (br.ready() || true) {
            String line = br.readLine();
            if (line == null) return;
            int t = Integer.parseInt(line.trim());
            
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                line = br.readLine();
                if (line == null) break;
                st = new StringTokenizer(line);
                
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                
                if (n >= m && (n - m) % 2 == 0) {
                    sb.append("Yes\n");
                } else {
                    sb.append("No\n");
                }
            }
            System.out.print(sb);
        }
    }
}
