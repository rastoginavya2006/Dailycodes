import java.util.*;
public class DaytonaCost{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
            }
            int count=0;
            for(int num:arr){
                if(num==m){
                    count=1;
                }
            }
            if(count==0){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
            
        }
    }
}