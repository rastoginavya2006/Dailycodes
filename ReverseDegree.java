import java.util.Scanner;

public class ReverseDegree {
    
    // Method to calculate reverse degree of a string
    public int reverseDegree(String s) {
        int sum = 0;

        // Loop through each character of string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Find weight of character (a=1, b=2, ..., z=26)
            int weight = ch - 'a' + 1;

            // Reverse weight = 27 - original weight
            int reverseWeight = 27 - weight;

            // Multiply by position (i+1) and add to sum
            sum += reverseWeight * (i + 1);
        }

        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase string: ");
        String input = sc.nextLine();

        ReverseDegree obj = new ReverseDegree();
        int result = obj.reverseDegree(input);

        System.out.println("Reverse Degree = " + result);

        sc.close();
    }
}
