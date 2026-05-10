import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class DislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Integer> likedNumbers = new ArrayList<>();
        
        int current = 1;
        while (likedNumbers.size() < 1000) {
            if (current % 3 != 0 && current % 10 != 3) {
                likedNumbers.add(current);
            }
            current++;
        }
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int k = sc.nextInt();
                System.out.println(likedNumbers.get(k - 1));
            }
        }
        sc.close();
    }
}
