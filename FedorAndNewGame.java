import java.util.Scanner;

public class FedorAndNewGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] armies = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            armies[i] = scanner.nextInt();
        }
        
        int fedorArmy = armies[m]; 
        int friendsCount = 0;
        
        for (int i = 0; i < m; i++) {
            int differences = fedorArmy ^ armies[i];
            
            int diffCount = 0;
            while (differences > 0) {
                differences = differences & (differences - 1);
                diffCount++;
            }
            
            if (diffCount <= k) {
                friendsCount++;
            }
        }
        
        System.out.println(friendsCount);
        
        scanner.close();
    }
}
