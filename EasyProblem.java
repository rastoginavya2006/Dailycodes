import java.util.Scanner;

public class EasyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // n is the number of people who gave an opinion
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            String result = "EASY";

            for (int i = 0; i < n; i++) {
                // If any person says 1, the problem is HARD
                if (sc.nextInt() == 1) {
                    result = "HARD";
                    break; 
                }
            }
            System.out.println(result);
        }
        
        sc.close();
    }
}