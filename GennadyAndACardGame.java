import java.util.Scanner;

public class GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNext()) {
            String tableCard = sc.next();
            
            boolean canPlay = false;
            
            for (int i = 0; i < 5; i++) {
                String handCard = sc.next();
                
                if (handCard.charAt(0) == tableCard.charAt(0) || 
                    handCard.charAt(1) == tableCard.charAt(1)) {
                    canPlay = true;
                    break; 
                }
            }
            
            if (canPlay) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
