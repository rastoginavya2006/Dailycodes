import java.util.*;
public class AvtoBus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            if(n%2!=0 || n<4){
                System.out.println(-1);
                continue;
            }
            long min=n/6;
            if(n%6!=0){
                min=min+1;
            }
            long max=n/4;
            System.out.println(min+" "+max);
        }
    }
}
