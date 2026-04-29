import java.util.*;
public class BlankSpace{
    public static void main(String[] args){
        Scanner sc = new Scanner ( System.in );
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n= sc.nextInt();
            int[] arr = new int[n];
            int max=0;
            int count=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(arr[i] ==0){
                    count++;
                    max=Math.max(max,count);
                }
                else{
                    count=0;
                }
            }
            System.out.println(max);
        }
    }
}
