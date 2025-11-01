import java.util.*;
public class MinimumSizeSubarraySum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the numbers in array: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        int left=0,sum=0,minLen=Integer.MAX_VALUE;
        for(int right =0;right<nums.length;right++){
            sum=sum+nums[right];
            while(sum>=target){
                minLen=Math.min(minLen,right-left+1);
                sum=sum-nums[left];
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE)
        System.out.println("The Length of Minimun Subarray: 0 ");
        else
        System.out.println("The Length of Minimun Subarray: "+ minLen);
        
    }
}