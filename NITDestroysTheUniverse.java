import java.util.Scanner;

public class NITDestroysTheUniverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int non_zero_segments = 0;
            int prev = 0; 
            
            for (int i = 0; i < n; i++) {
                int current = sc.nextInt();
                
                if (current != 0 && prev == 0) {
                    non_zero_segments++;
                }
                
                prev = current; 
            }
            
            if (non_zero_segments == 0) {
                System.out.println(0);
            } else if (non_zero_segments == 1) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
        
        sc.close();
    }
}
