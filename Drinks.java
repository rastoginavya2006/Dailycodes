import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double totalPercentage = 0;
        
        for (int i = 0; i < n; i++) {
            totalPercentage += sc.nextInt();
        }
        
        double result = totalPercentage / n;
        
        System.out.printf("%.12f\n", result);
        
        sc.close();
    }
}