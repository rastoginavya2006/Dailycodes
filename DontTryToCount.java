import java.util.*;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.next();
            String s = sc.next();
            int j = 0;
            boolean r = true;
            while (!(x.contains(s))) {
                x += x;
                j++;
                if (j > 6) {
                    r = false;
                    break;
                }
            }
            if (r)
                System.out.println(j);
            else
                System.out.println(-1);

        }
    }
}