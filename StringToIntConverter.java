import java.util.Scanner;

public class StringToIntConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringToIntConverter converter = new StringToIntConverter();

        System.out.print("Enter a string to convert to an integer: ");
        String input = scanner.nextLine();

        int result = converter.myAtoi(input);
        System.out.println("Converted integer: " + result);

        scanner.close();
    }

    public int myAtoi(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        final int INT_MAX = Integer.MAX_VALUE;
        final int INT_MIN = Integer.MIN_VALUE;
        
        int i = 0;
        int n = s.length();
        
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        if (i == n) {
            return 0;
        }
        
        int sign = 1;
        if (s.charAt(i) == '+') {
            i++;
        } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        
        long res = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            res = res * 10 + digit;
            
            if (sign == 1 && res > INT_MAX) {
                return INT_MAX;
            }
            if (sign == -1 && -res < INT_MIN) {
                return INT_MIN;
            }
            
            i++;
        }
        
        return (int)(res * sign);        
    }
}