import java.util.Scanner;

public class PythagoreanTriplesCounter {

    public int countTriples(int n) {
        int count = 0;
        
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                
                int targetSquare = a * a + b * b;
                
                int c = (int) Math.sqrt(targetSquare);
                
                if (c <= n && c * c == targetSquare) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum value (n): ");
        
        int n = scanner.nextInt();
        scanner.close();

        PythagoreanTriplesCounter solver = new PythagoreanTriplesCounter();
        int result = solver.countTriples(n);
        
        System.out.println("The total count of Pythagorean triples up to " + n + " is: " + result);
    }
}