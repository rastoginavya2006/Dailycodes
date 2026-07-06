import java.util.Scanner;

public class TenWordsOfWisdom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int maxQuality = -1;
            int winnerIndex = -1;
            
            for (int i = 1; i <= n; i++) {
                int words = sc.nextInt();
                int quality = sc.nextInt();
                
                
                if (words <= 10) {
                    
                    if (quality > maxQuality) {
                        maxQuality = quality;
                        winnerIndex = i;
                    }
                }
            }
            
            System.out.println(winnerIndex);
        }
        
        sc.close();
    }
}
