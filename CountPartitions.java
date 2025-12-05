import java.util.*;
public class CountPartitions {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int n=sc.nextInt();
        System.out.println("Enter elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        if(sum%2==0){
            System.out.println("There are "+(n-1)+" even partitions ");
        }
        else
        System.out.println("There are no  even partitions ");

    }
}
