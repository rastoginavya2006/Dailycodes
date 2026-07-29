import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class PrefixMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        if (br.ready() || true) {
            String line = br.readLine();
            if (line == null) return;
            st = new StringTokenizer(line);
            int t = Integer.parseInt(st.nextToken());
            
            StringBuilder sb = new StringBuilder();
            while (t-- > 0) {
                int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
                
                st = new StringTokenizer(br.readLine());
                long maxElement = 0;
                
                for (int i = 0; i < n; i++) {
                    long current = Long.parseLong(st.nextToken());
                    if (current > maxElement) {
                        maxElement = current;
                    }
                }
                
                long result = maxElement * n;
                sb.append(result).append("\n");
            }
            System.out.print(sb);
        }
    }
}
