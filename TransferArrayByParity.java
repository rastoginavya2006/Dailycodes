import java.util.Arrays;
import java.util.Scanner;

public class TransferArrayByParity {
    public int[] transformArray(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }

        TransferArrayByParity obj = new TransferArrayByParity();
        int[] res = obj.transformArray(nums);

        for(int x : res){
            System.out.print(x + " ");
        }
    }
}
