import java.util.Scanner;

public class LinearKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String keyboard = sc.next();
            String s = sc.next();
            
            
            int[] pos = new int[26];
            for (int i = 0; i < 26; i++) {
                pos[keyboard.charAt(i) - 'a'] = i + 1;
            }
            
            int totalTime = 0;
            for (int i = 1; i < s.length(); i++) {
                int prev = pos[s.charAt(i - 1) - 'a'];
                int curr = pos[s.charAt(i) - 'a'];
                totalTime += Math.abs(curr - prev);
            }
            
            System.out.println(totalTime);
        }
        sc.close();
    }
}
