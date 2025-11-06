import java.util.Scanner;

public class PrimeSetBitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left number: ");
        int left = sc.nextInt();

        System.out.print("Enter right number: ");
        int right = sc.nextInt();

        int count = 0;

        for (int i = left; i <= right; i++) {
            int x = Integer.bitCount(i);
            boolean isPrime = true;

            if (x <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(x); j++) {
                    if (x % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Count of numbers having prime set bits = " + count);
    }
}
