import java.util.*;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }

                Arrays.sort(a);

                if (a[0] == a[n - 1]) {
                    System.out.println(-1);
                } else {
                    List<Integer> b = new ArrayList<>();
                    List<Integer> c = new ArrayList<>();
                    int maxVal = a[n - 1];

                    for (int i = 0; i < n; i++) {
                        if (a[i] == maxVal) {
                            c.add(a[i]);
                        } else {
                            b.add(a[i]);
                        }
                    }

                    System.out.println(b.size() + " " + c.size());
                    for (int i = 0; i < b.size(); i++) {
                        System.out.print(b.get(i) + (i == b.size() - 1 ? "" : " "));
                    }
                    System.out.println();
                    for (int i = 0; i < c.size(); i++) {
                        System.out.print(c.get(i) + (i == c.size() - 1 ? "" : " "));
                    }
                    System.out.println();
                }
            }
        }
    }
}
