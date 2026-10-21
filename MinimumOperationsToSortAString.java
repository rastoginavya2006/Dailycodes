import java.util.Arrays;

public class MinimumOperationsToSortAString {
    public static int minOperations(String s) {
        if (isSorted(s)) {
            return 0;
        }
        if (s.length() <= 2) {
            return -1;
        }
     
        char[] c = s.toCharArray();
        Arrays.sort(c);
        if (s.charAt(0) == c || s.charAt(s.length() - 1) == c[s.length() - 1]) {
            return 1;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            if (s.charAt(i) == c || s.charAt(i) == c[s.length() - 1]) {
                return 2;
            }
        }
        return 3;
    }

    public static boolean isSorted(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) > s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] testStrings = {"abcde", "ba", "acedb", "daebc", "cba"};
        for (String test : testStrings) {
            Solution.minOperations(test); 
        }
    }
}
