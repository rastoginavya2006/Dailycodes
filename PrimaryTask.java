import java.util.Scanner;

public class PrimaryTask{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        String s = sc.next();
        
        if (s.length() >= 3 && s.startsWith("10")) {
            String suffix = s.substring(2);
            
            if (suffix.charAt(0) != '0') {
                int value = Integer.parseInt(suffix);
                if (value >= 2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}

