import java.util.Scanner;

public class VanyaAndCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            
            int h = 0;
            int cubesInLevel = 0;
            int totalCubes = 0;
            
            while (true) {
                h++; 
                cubesInLevel += h;
                totalCubes += cubesInLevel;
                
                if (totalCubes > n) {
                    h--;
                    break;
                }
            }
            
            System.out.println(h);
        }
        
        sc.close();
    }
}
