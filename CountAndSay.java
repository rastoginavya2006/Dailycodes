import java.util.Scanner;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CountAndSay program = new CountAndSay();

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        String result = program.countAndSay(n);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public String countAndSay(int n) {
        if (n <= 0) return "";
        String res = "1";
        
        for (int i = 1; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            int count = 1;
            
            for (int j = 1; j < res.length(); j++) {
                if (res.charAt(j) == res.charAt(j - 1)) {
                    count++;
                } else {
                    temp.append(count).append(res.charAt(j - 1));
                    count = 1;
                }
            }
            temp.append(count).append(res.charAt(res.length() - 1));
            res = temp.toString();
        }
        return res;
    }
}