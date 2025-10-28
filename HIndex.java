import java.util.*;
public class HIndex {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int hIndex=0;
        for(int h=1;h<=n;h++){
            int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=h)
            count++;
        }
        if(count>=h)
        hIndex=h;
        }
        System.out.println("The H-Index is : "+ hIndex);

    }
}
