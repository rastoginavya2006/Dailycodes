import java.util.Scanner;

public class SumDivisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers divisible by 3, 5, or 7 from 1 to " + n + " is: " + sum);
        sc.close();
    }
}
