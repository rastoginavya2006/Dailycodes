import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int[] calories = new int[5];
            for (int i = 1; i <= 4; i++) {
                calories[i] = sc.nextInt();
            }
            
            String s = sc.next();
            int totalCalories = 0;
            
            for (int i = 0; i < s.length(); i++) {
                int strip = s.charAt(i) - '0'; 
                totalCalories += calories[strip];
            }
            
            System.out.println(totalCalories);
        }
        
        sc.close();
    }
}
