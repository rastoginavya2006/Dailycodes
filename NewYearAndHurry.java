import java.util.*;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            
            int timeLeft = 240 - k;
            int problemsSolved = 0;
            int timeSpent = 0;
            
            for (int i = 1; i <= n; i++) {
                if (timeSpent + (5 * i) <= timeLeft) {
                    timeSpent += (5 * i);
                    problemsSolved++;
                } else {
                    break; 
                }
            }
            
            System.out.println(problemsSolved);
        }
    }
}