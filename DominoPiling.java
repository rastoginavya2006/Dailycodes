import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            int result = (M * N) / 2;

            System.out.println(result);
        }
        sc.close();
    }
}