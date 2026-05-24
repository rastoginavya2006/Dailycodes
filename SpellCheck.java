import java.util.Scanner;
import java.util.Arrays;

public class SpellCheck  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            String target = "Timru"; 
            
            while (t-- > 0) {
                int n = sc.nextInt();
                String s = sc.next();
                
                if (n != 5) {
                    System.out.println("NO");
                } else {
                    char[] arr = s.toCharArray();
                    Arrays.sort(arr);
                    String sortedS = new String(arr);
                    
                    if (sortedS.equals(target)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
        
        sc.close();
    }
}
