import java.util.Scanner;

public class StringToAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\nCharacter  |  ASCII Value");
        System.out.println("-------------------------");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int ascii = (int) ch;
            System.out.println("    " + ch + "      |     " + ascii);
        }

        sc.close();
    }
}
