import java.util.*;
public class OddQueries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n+1];
            long[] p= new long[n+1];
            for(int i=1;i<=n;i++){
                    arr[i]=sc.nextInt();
                    p[i]=p[i-1]+arr[i];
                }
            while(q-- >0){
                int l= sc.nextInt();
                int r= sc.nextInt();
                long k= sc.nextInt();
                
                long old= p[r]-p[l-1];
                long new1 = (r-l+1)*k;
                long sum= p[n]-old+new1;
                if(sum%2==0){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
            }
        }
    }
}
