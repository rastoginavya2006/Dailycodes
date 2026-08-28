import java.util.Scanner;

public class ErasingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int first = s.indexOf('1');
            int last = s.lastIndexOf('1');
            
            
            if (first == -1) {
                System.out.println(0);
                continue;
            }
            
            int count = 0;
            for (int i = first; i <= last; i++) {
                if (s.charAt(i) == '0') {
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
