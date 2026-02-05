import java.util.*;

class IntegerToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("Hexadecimal: 0");
            return;
        }

        long n = num & 0xFFFFFFFFL;
        String hexDigits = "0123456789ABCDEF";
        String hex = "";

        while (n > 0) {
            int rem = (int) (n % 16);
            hex = hexDigits.charAt(rem) + hex;
            n = n / 16;
        }

        System.out.println("Hexadecimal: " + hex);
    }
}
