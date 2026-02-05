import java.util.Scanner;
import java.util.Stack;
import java.lang.StringBuilder;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++){
            lastIndex[s.charAt(i) - 'a'] = i; 
        }
        
        boolean[] seen = new boolean[26];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            int curr = s.charAt(i) - 'a';
            
            if (seen[curr]) {
                continue;
            }
            
            while (!st.isEmpty() && 
                   st.peek() > curr && 
                   i < lastIndex[st.peek()]) {
                
                seen[st.pop()] = false;
            }
            
            st.push(curr);
            seen[curr] = true;
        }

        StringBuilder sb = new StringBuilder();
        
        while (!st.isEmpty()) {
            sb.append((char) (st.pop() + 'a')); 
        }
        
        return sb.reverse().toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string:");
        
        String inputString = scanner.nextLine();
        
        Solution solution = new Solution();
        
        String result = solution.removeDuplicateLetters(inputString);
        
        System.out.println("\n--- Result ---");
        System.out.println("Input String: " + inputString);
        System.out.println("Smallest Unique Subsequence: " + result);
        System.out.println("--------------");
        
        scanner.close();
    }
}