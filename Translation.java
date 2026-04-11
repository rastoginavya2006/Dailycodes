import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        
        StringBuilder sb = new StringBuilder(s1);
        String r = sb.reverse().toString();
        if(r.equals(s2)){
            System.out.println("Yes");
        }
        else
        System.out.println("No"); 
    }
}
