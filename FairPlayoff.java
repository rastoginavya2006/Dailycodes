import java.util.Scanner;

public class FairPlayoff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();
                int s4 = sc.nextInt();
                
                int max1 = Math.max(s1, s2);
                int min1 = Math.min(s1, s2);
                
                int max2 = Math.max(s3, s4);
                int min2 = Math.min(s3, s4);
                
                if (min1 > max2 || min2 > max1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        sc.close();
    }
}
