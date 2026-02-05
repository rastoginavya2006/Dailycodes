import java.util.Scanner;

public class ShopClosingOptimizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopClosingOptimizer program = new ShopClosingOptimizer();

        System.out.print("Enter customer arrival log (e.g., YNYY): ");
        String customers = scanner.nextLine();

        int result = program.bestClosingTime(customers);
        System.out.println("Best time to close: hour " + result);

        scanner.close();
    }

    public int bestClosingTime(String customers) {
        int bestTime = 0;
        int minPenalty = 0;
        int currentPenalty = 0;
        
        for (int i = 0; i < customers.length(); i++) {
            char ch = customers.charAt(i);
            
            if (ch == 'Y') {
                currentPenalty--;
            } else {
                currentPenalty++;
            }
            
            if (currentPenalty < minPenalty) {
                bestTime = i + 1;
                minPenalty = currentPenalty;
            }
        }
        
        return bestTime;
    }
}