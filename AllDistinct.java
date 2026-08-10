import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class AllDistinct {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            HashSet<Integer> uniqueElements = new HashSet<>();
            for (int i = 0; i < n; i++) {
                uniqueElements.add(Integer.parseInt(st.nextToken()));
            }
            
            int distinctCount = uniqueElements.size();
            int removed = n - distinctCount;
            
            if (removed % 2 == 0) {
                out.append(distinctCount).append("\n");
            } else {
                out.append(distinctCount - 1).append("\n");
            }
        }
        System.out.print(out);
    }
}
