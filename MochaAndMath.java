import java.util.*;
public class MochaAndMath{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int ans=sc.nextInt();
            for(int i=1;i<n;i++){
                int x=sc.nextInt();
                ans=ans&x;
            }
            System.out.println(ans);
        }
    }
}
