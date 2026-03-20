import java.util.*;

public class SumOfRoundNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                List<Integer> rounds = new ArrayList<>();
                int multiplier = 1;

                while (n > 0) {
                    int lastDigit = n % 10;
                    if (lastDigit != 0) {
                        rounds.add(lastDigit * multiplier);
                    }
                    n /= 10;
                    multiplier *= 10;
                }

                System.out.println(rounds.size());
                for (int num : rounds) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }
}