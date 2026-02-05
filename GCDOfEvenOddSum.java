import java.util.Scanner;

public class GCDOfEvenOddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumOdd = n * n;         
        int sumEven = n * (n + 1);  

        int gcd = n; 

        System.out.println("GCD = " + gcd);
    }
}
