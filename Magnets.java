import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int groups = 1;
        String current = sc.next();
        
        for (int i = 1; i < n; i++) {
            String next = sc.next();
            if (!next.equals(current)) {
                groups++;
                current = next;
            }
        }
        
        System.out.println(groups);
        sc.close();
    }
}