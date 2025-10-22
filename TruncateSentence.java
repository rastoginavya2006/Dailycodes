import java.util.Scanner;

class TruncateSentence {

    public String truncateSentence(String s, int k) {
        int count = 0;
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
                if (count == k) {
                    return result;
                }
                result += " ";
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter value of k (number of words to keep): ");
        int k = sc.nextInt();

        TruncateSentence obj = new TruncateSentence();
        String output = obj.truncateSentence(sentence, k);

        System.out.println("Truncated sentence: " + output);
    }
}
