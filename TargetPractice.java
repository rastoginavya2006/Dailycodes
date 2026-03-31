import java.util.*;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            for (int tc = 0; tc < t; tc++) {
                int totalPoints = 0;
                
                for (int i = 0; i < 10; i++) {
                    String row = sc.next();
                    for (int j = 0; j < 10; j++) {
                        if (row.charAt(j) == 'X') {
                            int ring = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                            totalPoints += (ring + 1);
                        }
                    }
                }
                System.out.println(totalPoints);
            }
        }
    }
}