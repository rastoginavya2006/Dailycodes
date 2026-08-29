import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OlympiadDate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            
            int req0 = 3, req1 = 1, req2 = 2, req3 = 1, req5 = 1;
            
            int ans = 0;
            boolean found = false;

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                int digit = Integer.parseInt(st.nextToken());

                if (digit == 0 && req0 > 0) req0--;
                else if (digit == 1 && req1 > 0) req1--;
                else if (digit == 2 && req2 > 0) req2--;
                else if (digit == 3 && req3 > 0) req3--;
                else if (digit == 5 && req5 > 0) req5--;

                if (!found && req0 == 0 && req1 == 0 && req2 == 0 && req3 == 0 && req5 == 0) {
                    ans = i;
                    found = true;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
