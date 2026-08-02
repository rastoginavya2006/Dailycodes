import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BePositive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine());
            
            int countNeg1 = 0;
            int countZero = 0;
            
            for (int i = 0; i < n; i++) {
                int val = Integer.parseInt(st.nextToken());
                if (val == -1) {
                    countNeg1++;
                } else if (val == 0) {
                    countZero++;
                }
            }
            
            int operations = countZero + 2 * (countNeg1 % 2);
            sb.append(operations).append("\n");
        }
        
        System.out.print(sb);
    }
}
