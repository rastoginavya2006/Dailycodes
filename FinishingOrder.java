import java.util.*;

public class FinishingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {
            order[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] friends = new int[m];
        for (int i = 0; i < m; i++) {
            friends[i] = sc.nextInt();
        }

        HashSet<Integer> friendSet = new HashSet<>();
        for (int f : friends) {
            friendSet.add(f);
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int x : order) {
            if (friendSet.contains(x)) {
                result.add(x);
            }
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
