import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Journey {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        
        int t = Integer.parseInt(tokenizer.nextToken());
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            long n = Long.parseLong(tokenizer.nextToken());
            long a = Long.parseLong(tokenizer.nextToken());
            long b = Long.parseLong(tokenizer.nextToken());
            long c = Long.parseLong(tokenizer.nextToken());
            
            long sum = a + b + c;
            long fullCycles = n / sum;
            long rem = n % sum;
            
            long ans = fullCycles * 3;
            if (rem > 0) {
                if (rem <= a) {
                    ans += 1;
                } else if (rem <= a + b) {
                    ans += 2;
                } else {
                    ans += 3;
                }
            }
            out.append(ans).append("\n");
        }
        System.out.print(out);
    }
}
