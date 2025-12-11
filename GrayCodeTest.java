import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrayCodeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for n : ");
        int n = scanner.nextInt();
        scanner.close();

        Solution solver = new Solution();

        List<Integer> result = solver.grayCode(n);

        System.out.println("Gray Code sequence for n=" + n + ": " + result);

        System.out.print("Binary representation: ");
        for (int num : result) {
            System.out.print(Integer.toBinaryString(num) + " ");
        }
    }
}

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<>();
        int limit = (int) Math.pow(2, n);
        
        for (int i = 0; i < limit; i++) {
            list.add(i ^ (i >> 1));
        }
        return list;
    }
}