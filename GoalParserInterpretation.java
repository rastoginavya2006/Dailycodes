import java.util.*;

public class GoalParserInterpretation {
    public String interpret(String command) {
        String s = "";
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                s += "G";
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                s += "o";
                i++;
            } else if (command.charAt(i) == 'a') {
                s += "al";
                i += 2;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        GoalParserInterpretation obj = new GoalParserInterpretation();
        System.out.println(obj.interpret(command));
    }
}
