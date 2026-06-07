import java.util.Scanner;

public class MinuteBeforeTheNewYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int h = sc.nextInt();
                int m = sc.nextInt();
                
                int totalMinutesPassed = h * 60 + m;
                
                int minutesLeft = 1440 - totalMinutesPassed;
                
                System.out.println(minutesLeft);
            }
        }
        
        sc.close();
    }
}
