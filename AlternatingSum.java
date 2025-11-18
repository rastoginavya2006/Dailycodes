import java.util.*;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        
        long sum = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) sum += nums[i];
            else sum -= nums[i];
        }
        
        System.out.println(sum);
    }
}
