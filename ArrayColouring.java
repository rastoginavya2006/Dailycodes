import java.util.*;
public class ArrayColouring{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            if(sum%2==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
