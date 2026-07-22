import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String a = scanner.next();
            int m = scanner.nextInt();
            String b = scanner.next();
            String c = scanner.next();

            StringBuilder addLeft = new StringBuilder();
            StringBuilder resultRight = new StringBuilder(a);

            for (int i = 0; i < m; i++) {
                if (c.charAt(i) == 'V') {
                    addLeft.append(b.charAt(i));
                } else {
                    resultRight.append(b.charAt(i));
                }
            }

            
            addLeft.reverse();
            
            System.out.println(addLeft.toString() + resultRight.toString());
        }

        scanner.close();
    }
}
