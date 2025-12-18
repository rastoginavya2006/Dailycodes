import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestPalindromeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        
        Solution solver = new Solution();
        int result = solver.longestPalindrome(s);
        
        System.out.println("Longest Palindrome Length: " + result);
        
        scanner.close();
    }
}

class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            
            if (map.get(ch) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        
        if (oddCount > 1)
            return s.length() - oddCount + 1;
            
        return s.length();
    }
}