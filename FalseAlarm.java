import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FalseAlarm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int firstClosed = -1;
            int lastClosed = -1;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int doorState = Integer.parseInt(st.nextToken());
                if (doorState == 1) { 
                    if (firstClosed == -1) {
                        firstClosed = i;
                    }
                    lastClosed = i;
                }
            }

          
            if (firstClosed == -1) {
                sb.append("YES\n");
            } else {
                int requiredSeconds = lastClosed - firstClosed + 1;
                if (x >= requiredSeconds) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.print(sb);
    }
}
