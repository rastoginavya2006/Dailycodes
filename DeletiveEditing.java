import java.util.*;
public class DeletiveEditing{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k-- >0){
            String s= sc.next();
            String t= sc.next();
            int[] freq= new int[26];
            for(int i=0;i<t.length();i++){
                freq[t.charAt(i)-'A']++;
            }
            StringBuilder temp= new StringBuilder();
            for(int i=s.length()-1;i>=0;i--){
                char c = s.charAt(i);
                if(freq[c-'A']>0){
                    temp.append(c);
                    freq[c-'A']--;
                }
            }
            temp.reverse();
            if(temp.toString().equals(t)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
