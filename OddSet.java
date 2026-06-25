import java.util.*;
public class OddSet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int c=0;
            for(int i=0;i<2*n;i++){
                int m= sc.nextInt();
                if(m%2!=0){
                    c++;
                }
            }
            if(c==n){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
