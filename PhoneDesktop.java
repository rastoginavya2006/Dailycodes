import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PhoneDesktop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            int screens = (y + 1) / 2;
            
            int usedCellsByY = y * 4;
            int totalCellsAllocated = screens * 15;
            int remainingSlots = totalCellsAllocated - usedCellsByY;
            
            if (x > remainingSlots) {
                int extraX = x - remainingSlots;
                screens += (extraX + 14) / 15;
            }
            
            sb.append(screens).append("\n");
        }
        
        System.out.print(sb);
    }
}
