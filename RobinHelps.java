import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RobinHelps {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        StringTokenizer st;

        
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int currentGold = 0;
            int peopleHelped = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                int gold = Integer.parseInt(st.nextToken());

               
                if (gold >= k) {
                    currentGold += gold;
                } 
               
                else if (gold == 0 && currentGold > 0) {
                    peopleHelped++;
                    currentGold--;
                }
            }
            
            output.append(peopleHelped).append("\n");
        }
        
        System.out.print(output);
    }
}
