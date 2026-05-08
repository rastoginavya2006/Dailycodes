import java.util.*;
public class LoveStory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        sc.nextLine();
        String s = "codeforces";
        for(int j=0;j<t;j++){
            String s1=sc.next();
            int count=0;
            for(int i=0;i<10;i++){
                if(s.charAt(i)!=s1.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
