import java.util.Scanner;

public class AddOddOrSubtractEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            if (a == b) {
                System.out.println(0);
            } else if (a < b) {
                int diff = b - a;
                if (diff % 2 != 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            } else {
                int diff = a - b;
                if (diff % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }
        }
        
        scanner.close();
    }
}
