import java.util.*;

public class RemoveOuterParentheses {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    result.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();

        String output = removeOuterParentheses(input);

        System.out.println("Output after removing outer parentheses: " + output);
    }
}
