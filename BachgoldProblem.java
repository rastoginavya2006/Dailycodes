import java.util.Scanner;

public class BachgoldProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int k = n / 2;
            System.out.println(k);
            
            if (n % 2 == 0) {
                for (int i = 0; i < k; i++) {
                    System.out.print(2 + (i == k - 1 ? "" : " "));
                }
            } else {
                for (int i = 0; i < k - 1; i++) {
                    System.out.print(2 + " ");
                }
                System.out.print(3);
            }
            System.out.println();
        }
        sc.close();
    }
}
