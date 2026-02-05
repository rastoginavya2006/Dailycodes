import java.util.*;

public class GameResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        ArrayList<Integer> arr = new ArrayList<>();

        int left = 0, right = 1;
        while (right < n) {
            arr.add(nums[right]);
            arr.add(nums[left]);
            left += 2;
            right += 2;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
