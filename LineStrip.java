import java.util.*;
public class LineStrip{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int g=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[g];
            for(int j=0;j<g;j++){
                arr[j]=sc.nextInt();
            }
            int curr=0;
            int min=arr[0]-0;
            for(int k=1;k<g;k++){
                curr=arr[k]-arr[k-1];
                min=Math.max(curr,min);
            }
            min=Math.max(min,2*(x-arr[g-1]));
           System.out.println(min);
        }
    }
}