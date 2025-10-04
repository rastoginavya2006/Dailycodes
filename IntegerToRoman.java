import java.util.Scanner;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1 to 3999): ");
        int num = sc.nextInt();

        if (num < 1 || num > 3999) {
            System.out.println("Number out of range! Please enter between 1 and 3999.");
            return;
        }

        System.out.println("Roman numeral: " + intToRoman(num));
        sc.close();
    }

    public static String intToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romans = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(romans[i]);
            }
        }
        return sb.toString();
    }
}
