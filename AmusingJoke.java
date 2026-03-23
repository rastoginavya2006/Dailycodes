import java.util.*;

public class AmusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String combined = s1 + s2;

        char[] c1 = combined.toCharArray();
        char[] c3 = s3.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c3);

        if (Arrays.equals(c1, c3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}