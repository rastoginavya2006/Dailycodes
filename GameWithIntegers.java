import java.util.*;

public class GameWithIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            if (s % 3 == 0) {
                System.out.println("Second");

            } else {
                System.out.println("First");
            }

        }
    }
}