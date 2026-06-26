import java.util.Scanner;

public class NightAtTheMuseum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String s = sc.next();
            
            int totalRotations = 0;
            char current = 'a'; 
            
            for (char target : s.toCharArray()) {
                int diff = Math.abs(target - current);
                
                totalRotations += Math.min(diff, 26 - diff);
                
                current = target;
            }
            
            System.out.println(totalRotations);
        }
        
        sc.close();
    }
}
