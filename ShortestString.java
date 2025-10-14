import java.util.*;

public class ShortestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();

        System.out.println("Enter strings (only alphabets):");

        while (true) {
            String input = sc.nextLine();

            // Stop if non-alphabetic input is entered
            if (!input.matches("[a-zA-Z]+")) {
                break;
            }

            words.add(input);
        }

        if (words.isEmpty()) {
            System.out.println("No valid strings entered.");
        } else {
            // Find the first shortest string
            String shortest = words.get(0);
            for (String s : words) {
                if (s.length() < shortest.length()) {
                    shortest = s;
                }
            }

            System.out.println("Shortest string: " + shortest);
        }

        sc.close();
    }
}
