import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int animals = (n / 4) + ((n % 4) / 2);
                System.out.println(animals);
            }
        }
        sc.close();
    }
}
