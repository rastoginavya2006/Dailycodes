import java.util.*;
public class HarshadNumber {
    public static int harshad(int x){
        int sum=0;
        int num=x;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        if(x%sum==0)
        return sum;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x=sc.nextInt();
        System.out.println(harshad(x));
      
    }
}
