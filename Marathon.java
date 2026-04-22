import java.util.*;

public class Marathon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int a = sc.nextInt(); 
            int count = 0;
            
            for (int i = 0; i < 3; i++) {
                if (sc.nextInt() > a) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
    }
}
