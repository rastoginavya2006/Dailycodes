import java.util.*;
public class  VasilijeInCacak{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- >0){
          long n = sc.nextLong();
          long k = sc.nextLong();
          long x = sc.nextLong();
          long sum=n*(n+1)/2;
          long first=k*(k+1)/2;
          long excludedSum = (n - k) * (n - k + 1) / 2;
          long last = sum - excludedSum;
          
          if(x>=first && x<=last){
              System.out.println("YES");
          }
          else{
              System.out.println("NO");
          }
        
        }
    }
}
