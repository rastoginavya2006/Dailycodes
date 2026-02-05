import java.util.*;

public class VowelReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VowelReverser solver = new VowelReverser();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String result = solver.reverseVowels(input);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public String reverseVowels(String s) {
        List<Character> vowel = new ArrayList<>();
        String vowelsStr = "aeiouAEIOU";

        for (char c : s.toCharArray()) {
            if (vowelsStr.indexOf(c) != -1) {
                vowel.add(c);
            }
        }

        Collections.reverse(vowel);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (vowelsStr.indexOf(c) != -1) {
                sb.append(vowel.get(i));
                i++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}