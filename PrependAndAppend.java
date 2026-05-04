import java.util.*;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next(); 
            
            int left = 0;
            int right = n - 1;
            
            while (left < right) {
                if ((s.charAt(left) == '0' && s.charAt(right) == '1') || 
                    (s.charAt(left) == '1' && s.charAt(right) == '0')) {
                    left++;
                    right--;
                } else {
                    break;
                }
            }
            
            System.out.println(Math.max(0, right - left + 1));
        }
        
        sc.close();
    }
}
