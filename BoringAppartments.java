import java.util.Scanner;

public class BoringAppartments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                String x = sc.next();
                
                int d = x.charAt(0) - '0';
                int len = x.length();
                
                int total = (d - 1) * 10 + (len * (len + 1)) / 2;
                
                System.out.println(total);
            }
        }
        
        sc.close();
    }
}
