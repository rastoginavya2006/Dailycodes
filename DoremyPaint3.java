import java.util.*;

public class DoremyPaint3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                Map<Integer, Integer> map = new HashMap<>();

                for (int i = 0; i < n; i++) {
                    int num = sc.nextInt();
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }

                if (map.size() == 1) {
                    System.out.println("Yes");
                } else if (map.size() == 2) {
                    List<Integer> counts = new ArrayList<>(map.values());
                    int c1 = counts.get(0);
                    int c2 = counts.get(1);

                    if (Math.abs(c1 - c2) <= 1) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                } else {

                    System.out.println("No");
                }
            }
        }
    }
}