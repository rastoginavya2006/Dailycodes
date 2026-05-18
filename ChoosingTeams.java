import java.util.Scanner;

public class ChoosingTeams  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            
            int eligibleStudents = 0;
            
            for (int i = 0; i < n; i++) {
                int y = sc.nextInt();
                if (y + k <= 5) {
                    eligibleStudents++;
                }
            }
            System.out.println(eligibleStudents / 3);
        }
        
        sc.close();
    }
}
