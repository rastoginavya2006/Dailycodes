import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SquareYear {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            int n = Integer.parseInt(s);

            int sq = (int) Math.round(Math.sqrt(n));

            if (sq * sq == n) {
                sb.append("0 ").append(sq).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        
        System.out.print(sb);
    }
}

