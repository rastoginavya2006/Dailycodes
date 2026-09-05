import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Scale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        int t = Integer.parseInt(line.trim());
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            String[] grid = new String[n];
            for (int i = 0; i < n; i++) {
                grid[i] = br.readLine();
            }
            
            
            for (int i = 0; i < n; i += k) {
                for (int j = 0; j < n; j += k) {
                    out.append(grid[i].charAt(j));
                }
                out.append("\n");
            }
        }
        
       
        System.out.print(out);
    }
}
