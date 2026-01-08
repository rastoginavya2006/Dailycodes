import java.util.*;

public class TextJustifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextJustifier tj = new TextJustifier();

        System.out.println("Enter the words separated by spaces:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        System.out.print("Enter the maximum width: ");
        int maxWidth = scanner.nextInt();

        List<String> formattedText = tj.fullJustify(words, maxWidth);

        System.out.println("\nFormatted Text:");
        for (String line : formattedText) {
            System.out.println("\"" + line + "\"");
        }
        
        scanner.close();
    }

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int index = 0;

        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;

            while (last < words.length) {
                if (words[last].length() + count + 1 > maxWidth) break;
                count += words[last].length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;

            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) builder.append(" ");
                }
                while (builder.length() < maxWidth) builder.append(" ");
            } else {
                int totalSpaces = maxWidth - (count - diff);
                int spacePerGap = totalSpaces / diff;
                int extraSpaces = totalSpaces % diff;

                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        int spacesToApply = spacePerGap + (i - index < extraSpaces ? 1 : 0);
                        for (int s = 0; s < spacesToApply; s++) builder.append(" ");
                    }
                }
            }

            result.add(builder.toString());
            index = last;
        }
        return result;
    }
}