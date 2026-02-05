import java.util.Scanner;

public class MirrorDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MirrorDifference program = new MirrorDifference();

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int result = program.mirrorDistance(n);
            System.out.println("Mirror Distance: " + result);
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }

    private int rev(int n) {
        int a = 0;
        while (n > 0) {
            a = a * 10 + (n % 10);
            n /= 10;
        }
        return a;
    }

    public int mirrorDistance(int n) {
        int m = rev(n);
        return Math.abs(m - n);
    }
}