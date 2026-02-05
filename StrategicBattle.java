import java.util.*;
import java.lang.Math;

public class StrategicBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // number of test cases
        long[][] qs = new long[T][2];
        
        // input pairs (r, c)
        for (int i = 0; i < T; i++) {
            qs[i][0] = sc.nextLong();
            qs[i][1] = sc.nextLong();
        }
        
        final double phi = (1.0 + Math.sqrt(5.0)) / 2.0; // golden ratio
        
        // process each test case
        for (int i = 0; i < T; i++) {
            long r = qs[i][0];
            long c = qs[i][1];
            
            long x = Math.min(r, c);
            long y = Math.max(r, c);
            long k = y - x;
            
            // calculate a = floor(k * phi)
            long a = (long) Math.floor(k * phi + 1e-9);
            
            if (a == x) {
                System.out.println("sami");
            } else {
                System.out.println("canthi");
            }
        }
        
        sc.close();
    }
}

