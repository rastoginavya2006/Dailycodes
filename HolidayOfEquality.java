import java.util.*;
public class HolidayOfEquality{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n==1){
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];
        int max=-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        int c=0;
        for(int x:arr){
            c=c+max-x;
        }
        System.out.println(c);
        
    }
}
