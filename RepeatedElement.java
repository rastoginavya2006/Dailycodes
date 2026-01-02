import java.util.Scanner;

public class RepeatedElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RepeatedElement program = new RepeatedElement();

        System.out.print("Enter the number of elements (must be 2N): ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        int result = program.repeatedNTimes(A);
        System.out.println("The repeated element is: " + result);

        scanner.close();
    }

    public int repeatedNTimes(int[] A) {
        // Checking for the repeated element within a gap of 2
        for (int i = 0; i < A.length - 2; i++) {
            if (A[i] == A[i + 1] || A[i] == A[i + 2]) {
                return A[i];
            }
        }
        
        // If not found in the first (n-2) elements, the last element must be the one
        return A[A.length - 1];
    }
}