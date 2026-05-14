import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            int upper = 0;
            int lower = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    upper++;
                } else {
                    lower++;
                }
            }
            if (upper > lower) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s.toLowerCase());
            }
        }
        
        sc.close();
    }
}
