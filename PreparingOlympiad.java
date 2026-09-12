import java.util.*;
public class PreparingOlympiad{
    static int n,l,r,x ;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();
        r = sc.nextInt();
        x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = solve(n, arr,0,0,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        System.out.println(ans);
    }
    public static int solve(int n , int[] arr, int index, int curr, int count, int max, int min){
        if(index==n){
            if(count>=2 && curr>=l && curr<=r && max-min >=x){
                return 1;
            }
            else{
                return 0;
            }
        }
        int notpick=solve(n,arr,index+1,curr,count,max,min);
        curr=curr+arr[index];
        max=Math.max(max,arr[index]);
        min= Math.min(min,arr[index]);
        int pick = solve(n,arr,index+1,curr,count+1,max,min);
        return pick+notpick;
        
    }
}
