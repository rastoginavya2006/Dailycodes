import java.util.*;

public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        
        for(int i = 0; i < 2 * n; i++){
            nums[i] = sc.nextInt();
        }
        
        int[] ans = new int[2 * n];
        int idx = 0;
        
        for(int i = 0; i < n; i++){
            ans[idx++] = nums[i];
            ans[idx++] = nums[i + n];
        }
        
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
