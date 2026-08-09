import java.util.*;

public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] finalDigits = new int[n];
            
            for (int i = 0; i < n; i++) {
                finalDigits[i] = sc.nextInt();
            }
          
            for (int i = 0; i < n; i++) {
                int movesCount = sc.nextInt();
                if (movesCount > 0) {
                    String sequence = sc.next();
                    for (int j = 0; j < movesCount; j++) {
                        char move = sequence.charAt(j);
                        if (move == 'U') {
                            finalDigits[i]--; 
                        } else if (move == 'D') {
                            finalDigits[i]++; 
                        }
                    }
                   
                    finalDigits[i] = (finalDigits[i] % 10 + 10) % 10;
                }
            }
            
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(finalDigits[i]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
        
        sc.close();
    }
}
