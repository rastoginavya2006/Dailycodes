import java.util.*;
public class MultiplyBy2OrDivideBy6{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            long n = sc.nextLong();
            int count=0;
            while(n!=1){
                if(n%3!=0){
                    count=-1;
                    break;
                }
                else{
                    if(n%6==0){
                        count++;
                        n=n/6;
                    }
                    else{
                        count++;
                        n=n*2;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
