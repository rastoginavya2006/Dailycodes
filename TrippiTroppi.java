import java.util.Scanner;

public class TrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            String s3 = sc.next();
            
            System.out.println("" + s1.charAt(0) + s2.charAt(0) + s3.charAt(0));
        }
        
        sc.close();
    }
}
