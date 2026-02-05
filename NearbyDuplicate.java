import java.util.*;

public class NearbyDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NearbyDuplicate solver = new NearbyDuplicate();

        System.out.println("Enter numbers separated by spaces:");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.print("Enter k (max distance): ");
        int k = scanner.nextInt();

        boolean result = solver.containsNearbyDuplicate(nums, k);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int oldIndex = map.get(nums[i]);
                if (Math.abs(i - oldIndex) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        
        return false;
    }
}