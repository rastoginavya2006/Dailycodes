import java.util.Scanner;

public class ScoreOfParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter parentheses string: ");
        String s = scanner.nextLine();
        
        int depth = 0;
        int score = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                depth++;
            } else {
                depth--;
                if(s.charAt(i-1) == '(') {
                    score += 1 << depth;
                }
            }
        }
        
        System.out.println("Score: " + score);
        
        scanner.close();
    }
}
