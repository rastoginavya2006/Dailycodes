import java.util.*;
public class ColourBlindness{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while(t-- >0){
            int c = sc.nextInt();
             String s1 = sc.next();
             String s2 = sc.next();
             int x=0;
             for(int i=0;i<c;i++){
                 if(s1.charAt(i)!=s2.charAt(i) && (s1.charAt(i)=='R' || s2.charAt(i)=='R')){
                     x++;
                     break;
                 }
             }
             if(x>0){
                 System.out.println("NO");
             }
             else{
                 System.out.println("YES");
             }
        }
    }
}
