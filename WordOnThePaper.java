import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class WordOnThePaper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());

        while (t-- > 0) {
            StringBuilder word = new StringBuilder();

            // The grid is always 8x8
            for (int i = 0; i < 8; i++) {
                String line = br.readLine();
                for (int j = 0; j < 8; j++) {
                    char c = line.charAt(j);
                    if (c != '.') {
                        word.append(c);
                    }
                }
            }

            System.out.println(word.toString());
        }
    }
}
