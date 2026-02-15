
import java.util.*;
public class BoyOrGirl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        int n=set.size();
        if(n%2==0){
            System.out.println("CHAT WITH HER !");
        }
        else{
             System.out.println("Ignore him");
        }
    }
}