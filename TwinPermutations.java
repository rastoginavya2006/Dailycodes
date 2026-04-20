import java.util.*;
public class TwinPermutations{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int[] arr =new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                System.out.print(n+1-arr[j]+" ");
            }
            System.out.println();
            
        }
    }
}
