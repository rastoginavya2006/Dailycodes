import java.util.*;
public class BuildArrayFromPermutation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[arr[i]];
        }
        System.out.println("Array after Permutation: ");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}