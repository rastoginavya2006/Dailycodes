import java.util.Scanner;

public class OnlyOneDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 
            while (t-- > 0) {
                String s = sc.next();
                
                char minDigit = '9';
                
                for (char ch : s.toCharArray()) {
                    if (ch < minDigit) {
                        minDigit = ch;
                    }
                }
                
                System.out.println(minDigit);
            }
        }
        
        sc.close();
    }
}
