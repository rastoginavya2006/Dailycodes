import java.util.*;
public class Coins{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            long n=sc.nextLong();
            long k=sc.nextLong();
            if(n%2==0){
                System.out.println("Yes");
        }
        else if (n>=k && k%2!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}}
