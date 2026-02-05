import java.util.*;

public class ConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr = new int[26];
        for (char c : allowed.toCharArray())
            arr[c - 'a'] = 1;
        int count = 0;
        for (String w : words)
            count += isConsistent(arr, w);
        return count;
    }

    public static int isConsistent(int[] arr, String w) {
        for (int i = 0; i < w.length(); i++)
            if (arr[w.charAt(i) - 'a'] == 0)
                return 0;
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter allowed characters: ");
        String allowed = sc.next();
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println("Enter words:");
        for (int i = 0; i < n; i++)
            words[i] = sc.next();
        ConsistentString s = new ConsistentString();
        int res = s.countConsistentStrings(allowed, words);
        System.out.println("Count of consistent strings: " + res);
    }
}
