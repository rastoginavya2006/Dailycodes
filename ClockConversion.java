import java.util.Scanner;

public class ClockConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int i = 0; i < t; i++) {
            String time = scanner.next();
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3, 5));
            
            String period = (h >= 12) ? " PM" : " AM";
            if (h == 0) {
                h = 12;
            } else if (h > 12) {
                h -= 12;
            }
            
            System.out.printf("%02d:%02d%s\n", h, m, period);
        }
        scanner.close();
    }
}
