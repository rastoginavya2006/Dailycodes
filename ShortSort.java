import java.util.*;
public class ShortSort{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            if(s.equals("bca") || s.equals("cab")){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
            }
        }
    }
}
