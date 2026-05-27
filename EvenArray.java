import java.util.Scanner;

public class EvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int evenErrors = 0;
                int oddErrors = 0;
                
                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    
                    if (i % 2 != val % 2) {
                        if (val % 2 == 0) {
                            evenErrors++; 
                        } else {
                            oddErrors++;  
                        }
                    }
                }
                
                if (evenErrors == oddErrors) {
                    System.out.println(evenErrors);
                } else {
                    System.out.println("-1");
                }
            }
        }
        
        sc.close();
    }
}
