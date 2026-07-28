import java.util.Scanner;

public class ParkLighting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            
            int totalSquares = n * m;
            
          
            int minLanterns = (totalSquares + 1) / 2;
            
            System.out.println(minLanterns);
        }
        
        sc.close();
    }
}
