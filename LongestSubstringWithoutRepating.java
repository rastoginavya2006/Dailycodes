import java.util.*;

public class LongestSubstringWithoutRepating {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            
      
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println("Length of longest substring without repeating characters: " + lengthOfLongestSubstring(s));
    }
}
