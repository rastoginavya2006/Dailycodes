import java.util.*;

public class CreatingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s1 = sc.next();
                String s2 = sc.next();

               
                String newS1 = s2.charAt(0) + s1.substring(1);
                String newS2 = s1.charAt(0) + s2.substring(1);

                System.out.println(newS1 + " " + newS2);
            }
        }
        sc.close();
    }
}
