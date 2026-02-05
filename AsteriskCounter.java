import java.util.Scanner;

public class AsteriskCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AsteriskCounter program = new AsteriskCounter();

        System.out.print("Enter string: ");
        String s = scanner.nextLine();

        int result = program.countAsterisks(s);
        System.out.println(result);

        scanner.close();
    }

    public int countAsterisks(String s) {
        int res = 0, bars = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*' && bars % 2 == 0) {
                res++;
            }
            if (s.charAt(i) == '|') {
                bars++;
            }
        }
        return res;
    }
}