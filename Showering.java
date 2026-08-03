import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Showering {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            while (st == null || !st.hasMoreTokens()) {
                String sLine = br.readLine();
                if (sLine == null) break;
                st = new StringTokenizer(sLine);
            }
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int prev = 0;
            boolean possible = false;

            for (int i = 0; i < n; i++) {
                while (!st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                int left = Integer.parseInt(st.nextToken());
                int right = Integer.parseInt(st.nextToken());

                if (left - prev >= s) {
                    possible = true;
                }
                prev = right;
            }

            if (m - prev >= s) {
                possible = true;
            }

            if (possible) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
            }
        }

        System.out.print(out);
    }
}
