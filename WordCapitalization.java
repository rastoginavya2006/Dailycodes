import java.util.*;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        
        if (s.length() > 0) {
            char firstChar = s.charAt(0);
            
            if (firstChar >= 'a' && firstChar <= 'z') {
                firstChar = (char)(firstChar - 32);
            }
            
            System.out.println(firstChar + s.substring(1));
        }
    }
}