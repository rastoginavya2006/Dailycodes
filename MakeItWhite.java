import java.util.Scanner;

public class MakeItWhite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            
            int firstB = s.indexOf('B');
            int lastB = s.lastIndexOf('B');
            
            if (firstB == -1) {
                System.out.println(0);
            } else {
                
                System.out.println(lastB - firstB + 1);
            }
        }
        
        sc.close();
    }
}
