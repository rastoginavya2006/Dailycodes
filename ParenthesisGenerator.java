import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParenthesisGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ParenthesisGenerator generator = new ParenthesisGenerator();

        System.out.print("Enter the number of pairs (n): ");
        int n = scanner.nextInt();

        List<String> result = generator.generateParenthesis(n);

        System.out.println("Valid Combinations:");
        for (String s : result) {
            System.out.println(s);
        }

        scanner.close();
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }

    private void recurse(List<String> res, int left, int right, String s, int n) {
        if (s.length() == n * 2) {
            res.add(s);
            return;
        }

        if (left < n) {
            recurse(res, left + 1, right, s + "(", n);
        }

        if (right < left) {
            recurse(res, left, right + 1, s + ")", n);
        }
    }
}