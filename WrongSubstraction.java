import java.util.*;
public class WrongSubstraction{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            if(n%10==0){
                n=n/10;
            }
            else{
                n=n-1;
            }
        }
        System.out.println(n);
    }
}
