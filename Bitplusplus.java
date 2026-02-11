import java.util.*;

public class Bitplusplus
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (s[i].equals("++X")) {
                ++x;
            } else if (s[i].equals("X++")) {
                x++;
            } else if (s[i].equals("--X")) {
                --x;
            } else if (s[i].equals("X--")) {
                x--;
            }
        }
        System.out.println(x);

    }
}