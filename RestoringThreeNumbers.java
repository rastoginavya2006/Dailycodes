import java.util.*;

public class RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] x = new int[4];
        for (int i = 0; i < 4; i++) {
            x[i] = sc.nextInt();
        }
        
        Arrays.sort(x);
        
        int abc = x[3]; 
        for (int i = 0; i < 3; i++) {
            System.out.print((abc - x[i]) + " ");
        }
        System.out.println();
        
        sc.close();
    }
}
