import java.util.Scanner;

public class FileName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        String str = scan.next();
        
        int deletions = 0;
        
       
        for (int i = 0; i < n - 2; i++) {
           
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x' && str.charAt(i + 2) == 'x') {
                deletions++;
            }
        }
        
        System.out.println(deletions);
        
        scan.close();
    }
}
