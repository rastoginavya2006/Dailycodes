import java.util.*;
public class Desorting{
    public static void main(String[]  args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n;i++){
                arr[i]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            int d=Integer.MAX_VALUE;
            boolean r= true;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    r=false;
                }
                
                d=arr[i+1]-arr[i];
                min=Math.min(d,min);
                
            }
            if(!r){
                System.out.println(0);
            }else
            System.out.println(min/2+1);
            
        }
    }
}