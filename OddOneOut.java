import java.util.*;
public class OddOneOut{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a==b){
                System.out.println(c);
            }
            else if(c==b){
                System.out.println(a);
            }
            else{
                System.out.println(b);
            }
        }
    }
}
