import java.util.Scanner;
import java.util.Arrays;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        char[] digits = s.replace("+", "").toCharArray();
        Arrays.sort(digits);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < digits.length; i++) {
            result.append(digits[i]);
            if (i < digits.length - 1) {
                result.append("+");
            }
        }
        
        System.out.println(result.toString());
        sc.close();
    }
}