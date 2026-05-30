import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                int len = s.length();
                
                if (len % 2 != 0) {
                    System.out.println("NO");
                } else {
                    int mid = len / 2;
                    String firstHalf = s.substring(0, mid);
                    String secondHalf = s.substring(mid);
                    
                    if (firstHalf.equals(secondHalf)) {
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
