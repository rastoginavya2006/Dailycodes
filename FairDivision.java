import java.util.Scanner;

public class FairDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                
                int count1 = 0;
                int count2 = 0;
                
                for (int i = 0; i < n; i++) {
                    int weight = sc.nextInt();
                    if (weight == 1) {
                        count1++;
                    } else {
                        count2++;
                    }
                }
                
                if ((count1 + 2 * count2) % 2 != 0) {
                    System.out.println("NO");
                } else if (count1 == 0 && count2 % 2 != 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
        
        sc.close();
    }
}
